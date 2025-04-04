class Person {
       private String name;
    private int age;

       public String getName() {
        return name;
    }

        public void setName(String name) {
        this.name = name;
    }

        public int getAge() {
        return age;
    }

       public void setAge(int age) {
        if (age >= 0) { // Adding simple validation
            this.age = age;
        } else {
            System.out.println("Age cannot be negative");
        }
    }
}

public class Main {
    public static void main(String[] args) {
                Person person = new Person();

       
        person.setName("John");
        person.setAge(30);

              System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}