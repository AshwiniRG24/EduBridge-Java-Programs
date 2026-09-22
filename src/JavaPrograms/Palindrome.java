package JavaPrograms;

class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        int left = 0;
        int right = str.length() - 1;
        boolean isPalin = true;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalin = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println(str + " is palindrome: " + isPalin);
    }
}