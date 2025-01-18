package Level1;

public class Book2 {
    String title;

    String author;
    int price;
    boolean availability;

    Book2(String title, int price, String author, boolean isAvailability) {
        this.title = title;
        this.price = price;
        this.author = author;
        this.availability = isAvailability;
    }

    public void borrow() {
        if (availability) {
            System.out.println("Book name:" + title);
            System.out.println("Book Author:" + author);
            System.out.println("Price:" + price);
            availability = false;
        } else
            System.out.println(title + " is not available.");

    }

    public static void main(String[] args) {
        String title = "Half Way";
        int price = 800;
        String author = "Mohan";
        boolean isAvailability = true;
        Book2 b = new Book2(title, price, author, isAvailability);
        b.borrow();
        b.borrow();
    }
}
