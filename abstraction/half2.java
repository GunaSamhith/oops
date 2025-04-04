abstract class Employee {
    String name;
    int id;

        public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }

        public abstract double salary();
}

class FullTimeEmployee extends Employee {
    private double annualSalary;

    public FullTimeEmployee(String name, int id, double annualSalary) {
        super(name, id);
        this.annualSalary = annualSalary;
    }

    @Override
    public double salary() {
        return annualSalary;
    }
}


class PartTimeEmployee extends Employee {
    private double hourlyWage;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyWage, int hoursWorked) {
        super(name, id);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

   
    @Override
    public double salary() {
        return hourlyWage * hoursWorked;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee("John", 101, 60000);
        Employee partTimeEmployee = new PartTimeEmployee("Jane", 102, 20, 150);

        fullTimeEmployee.display();
        System.out.println("Full-Time Employee Salary: " + fullTimeEmployee.salary() + "\n");

        partTimeEmployee.display();
        System.out.println("Part-Time Employee Salary: " + partTimeEmployee.salary());
    }
}