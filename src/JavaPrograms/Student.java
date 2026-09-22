package JavaPrograms;

class Student {
    String name;
    int age;

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "ABC";
        s1.age = 20;

        s2.name = "XYZ";
        s2.age = 21;

        System.out.println(s1.name + " " + s1.age);
        System.out.println(s2.name + " " + s2.age);
    }
}