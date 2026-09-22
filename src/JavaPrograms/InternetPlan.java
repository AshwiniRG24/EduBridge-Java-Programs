package JavaPrograms;

class InternetPlan {
    String name;
    int price;

    InternetPlan() {
        this("Basic", 199);
    }

    InternetPlan(String name) {
        this(name, 299);
    }

    InternetPlan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println(name + " " + price);
    }

    public static void main(String[] args) {
        InternetPlan p1 = new InternetPlan();
        InternetPlan p2 = new InternetPlan("Premium");

        p1.display();
        p2.display();
    }
}