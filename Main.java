import company.models.*;
import company.abstracts.Employee;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Johny", 469469, 1, "01-01-1990", "worker");
        Worker worker2 = new Worker("Bravo", 486486, 2, "02-02-1991", "worker");
        Worker worker3 = new Worker("Mahatma", 3478, 2, "03-03-1992", "worker");

        Manager manager = new Manager("Bruce", 60000, 5, "05-05-1994", "manager");

        System.out.println(worker1.getName() + " has code: " + worker1.hashCode());
        System.out.println(worker2.getName() + " has code: " + worker2.hashCode());
        System.out.println(worker3.getName() + " has code: " + worker3.hashCode());
        System.out.println(manager.getName() + " has code: " + manager.hashCode());

        System.out.println("Worker2 (" + worker2.getName() + ") equals worker1 (" + worker1.getName() + "): " + worker2.equals(worker1));
        System.out.println("Worker2 (" + worker2.getName() + ") equals worker3 (" + worker3.getName() + "): " + worker2.equals(worker3));
        System.out.println("Worker2 (" + worker2.getName() + ") equals manager (" + manager.getName() + "): " + worker2.equals(manager));

    }
}
