import company.models.*;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Johny", 469469, 1);
        Worker worker2 = new Worker("Bravo", 486486, 2);
        Worker worker3 = new Worker("Mahatma", 3478, 3);
        Worker worker4 = new Worker("Gandhi", 15000, 4);

        Manager manager = new Manager("Bruce", 60000, 5);

        System.out.println("Salary of worker1: " + worker1.getSalary());
        worker1.work();
        System.out.println("Salary of worker2: " + worker2.getSalary());
        worker2.work();
        System.out.println("Salary of worker3: " + worker3.getSalary());
        worker3.work();
        System.out.println("Salary of worker4: " + worker4.getSalary());
        worker4.work();
        System.out.println("Salary of manager: " + manager.getSalary());
        manager.work();
    }
}
