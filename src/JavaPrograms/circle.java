package JavaPrograms;

class Circle {
    double radius = 5;

    void Calculate() {
        double area = 3.14 * radius * radius;
        double circumference = 2 * 3.14 * radius;

        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circumference);
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.Calculate();
    }
}