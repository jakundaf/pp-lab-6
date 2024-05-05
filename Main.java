import company.models.*;
import company.abstracts.Employee;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Johny", 469469, 1, "01-01-1990", "worker");
        Worker worker2 = new Worker("Bravo", 486486, 2, "02-02-1991", "worker");
        Worker worker3 = new Worker("Mahatma", 3478, 2, "03-03-1992", "worker");
        Worker worker4 = new Worker("Gandhi", 15000, 4, "04-04-1993", "worker");

        Manager manager = new Manager("Bruce", 60000, 5, "05-05-1994", "manager");
        Manager manager1 = new Manager("Lee", 45000, 2, "06-06-1995", "manager");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);
        employees.add(manager1);

        double totalSalary = 0;
        double totalManagerSalary = 0;
        double totalWorkerSalary = 0;
        Map<Integer, ArrayList<Employee>> map = new HashMap<>();

        for (Employee employee : employees){
            totalSalary += employee.getSalary();
            if (employee instanceof Manager){
                totalManagerSalary += employee.getSalary();
            } else if (employee instanceof Worker){
                totalWorkerSalary += employee.getSalary();
            }
            if (map.containsKey(employee.hashCode())) {
                map.get(employee.hashCode()).add(employee);
            } else {
                ArrayList<Employee> employeeList = new ArrayList<>();
                employeeList.add(employee);
                map.put(employee.hashCode(), employeeList);
            }
        }

        System.out.println("Total salary: " + totalSalary);
        System.out.println("Total manager salary: " + totalManagerSalary);
        System.out.println("Total worker salary: " + totalWorkerSalary);

        for (Map.Entry<Integer, ArrayList<Employee>>  entry : map.entrySet()) {
            ArrayList<Employee> employeeList = entry.getValue();
            if (employeeList.size() > 1) {
                System.out.println("Employyes with same ID: ");
                for (Employee employee : employeeList){
                    System.out.println(employee.getName());
                }
            }
        }
    }
}
