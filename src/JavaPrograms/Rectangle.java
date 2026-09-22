package JavaPrograms;

class Rectangle {
    int length = 10;
    int breadth = 5;

    void CalculateArea() {
        int area = length * breadth;
        System.out.println("Area = " + area);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.CalculateArea();
    }
}
