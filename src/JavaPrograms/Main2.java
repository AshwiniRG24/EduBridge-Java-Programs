package JavaPrograms;

class Main2 {
    public static void main(String[] args) {
        int a[] = {10, 11, 12, 13, 14, 15};
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);
    }
}