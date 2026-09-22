package JavaPrograms;

class Time {
    Time(int s) {
        System.out.println("Seconds = " + s);
    }

    Time(int m, int s) {
        System.out.println("Minutes = " + m);
        System.out.println("Seconds = " + s);
    }

    Time(int h, int m, int s) {
        System.out.println("Hours = " + h);
        System.out.println("Minutes = " + m);
        System.out.println("Seconds = " + s);
    }

    public static void main(String[] args) {
        new Time(30);
        new Time(5, 30);
        new Time(2, 10, 30);
    }
}