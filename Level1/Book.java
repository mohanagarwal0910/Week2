package Level1;

public class Book {
    String title;
    String author;
    int price;
    Book(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;

    }
    public void display(){
        System.out.println("Title :"+title);
        System.out.println("Author :"+author);
        System.out.println("Price :"+price);
    }
    public static void main(String[] args) {

        String title="Impossible";
        String author="Mohan";
        int price=500;
        Book book=new Book(title,author,price);
        book.display();
    }
}
