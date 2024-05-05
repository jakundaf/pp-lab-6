package company.abstracts;

import company.interfaces.Employable;

public abstract class Employee implements Employable {
    private String name;
    private double salary;
    private int id;
    private String hireDate;
    private String position;

    public Employee(String name, double salary, int id, String hireDate, String position) {
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.hireDate = hireDate;
        this.position = position;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public String getHireDate() {
        return hireDate;
    }
    public String getPosition() {
        return position;
    }
    public int hashCode() {
        return id;
    }
    public boolean equals (Object obj){
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }

        Employee employee = (Employee) obj;
        return this.id == employee.id;
    }

}
