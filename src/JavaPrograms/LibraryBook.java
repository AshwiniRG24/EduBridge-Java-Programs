package JavaPrograms;

class LibraryBook {
    String title;
    String author;
    int price;

    static int count = 0;

    LibraryBook(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
        count++;
    }

    static void showCount() {
        System.out.println("Total Books = " + count);
    }

    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook("Java", "ABC", 300);
        LibraryBook b2 = new LibraryBook("Python", "XYZ", 400);

        showCount();
    }
}