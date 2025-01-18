package Level1;

public class Book {
    String title;

    String author;
    int price;
    Book(){
        this.title="Impossible";
        this.author="Mohan";
        this.price=500;
    }
    Book(String title,int price,String author){
        this.title=title;
        this.price=price;
        this.author=author;
    }

    public void display() {
        System.out.println("Book name:"+title);
        System.out.println("Book Author:"+author);
        System.out.println("Price:"+price);
    }

    public static void main(String[] args) {
        Book book=new Book();
        book.display();
        String title="Half Way";
        int price=800;
        String author="Mohan";
        Book book2=new Book(title,price,author);
        book2.display();
    }

}
