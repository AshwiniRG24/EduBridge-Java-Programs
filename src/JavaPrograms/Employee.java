package JavaPrograms;

class Employee {
    String name;
    int age;

    Employee() {
        name = "unknown";
        age = 0;
    }

    Employee(String name) {
        this.name = name;
        this.age = 0;
    }

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Rahul");
        Employee e3 = new Employee("Priya", 22);

        e1.display();
        e2.display();
        e3.display();
    }
}