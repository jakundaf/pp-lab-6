import company.models.*;
import company.abstracts.Employee;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Johny", 469469, 1, "01-01-1990", "worker");
        Worker worker2 = new Worker("Bravo", 486486, 2, "02-02-1991", "worker");
        Worker worker3 = new Worker("Mahatma", 3478, 3, "03-03-1992", "worker");
        Worker worker4 = new Worker("Gandhi", 15000, 4, "04-04-1993", "worker");

        Manager manager = new Manager("Bruce", 60000, 5, "05-05-1994", "manager");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee employee : employees){
            System.out.println("- " + employee.getName() + " (ID: " + employee.hashCode() + ", Position: " +
                    employee.getPosition() + ", Hire date: " + employee.getHireDate() + ", Salary: " + employee.getSalary());
        }

    }
}
