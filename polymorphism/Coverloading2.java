class Employee {
    String name;
    int id;
    double salary;

    Employee() {
        this.name = "Unknown";
        this.id = 0;
        this.salary = 30000.0; // Default salary
    }
 
    Employee(String name) {
        this.name = name;
        this.id = 1001;
        this.salary = 35000.0;
    }
  
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        this.salary = 40000.0;
    }

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee: " + name + ", ID: " + id + ", Salary: $" + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Alice");
        Employee e3 = new Employee("Bob", 102);
        Employee e4 = new Employee("Charlie", 103, 50000.0);

        e1.display();
        e2.display();
        e3.display();
        e4.display();
    }
}