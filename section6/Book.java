public class Book {
    // یک متغیر استاتیک برای شمارش تعداد اشیاء
    private static int count = 0;
    private String title;
    private String author;

    
    public void displayInfo(String title, String author) {
        System.out.println("  ساخته شده: " + title + author);

    }

    // سازنده کلاس که با هر فراخوانی تعداد اشیاء را افزایش می‌دهد
    public Book() {
        count++;
    }

    // یک متد استاتیک برای دریافت تعداد اشیاء
    public static int getObjectCount() {
        return count;
    }


    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        Book obj1 = new Book();
        Book obj2 = new Book();
        Book obj3 = new Book();
        obj3.displayInfo("a", "b");

        // نمایش تعداد اشیاء ساخته شده
        System.out.println("تعداد اشیاء ساخته شده: " + Book.count);
    }


}

