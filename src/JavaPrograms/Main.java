package JavaPrograms;

public class Main {
    public static void main(String args[]) {
        int a[] = {10, 20, 30, 40, 50};
        int key = 30;
        boolean found = false;
        for (int i = 0; i < 5; i++) {
            if (a[i] == key) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not Found");
        }
    }
}