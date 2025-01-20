package Level1;

public class Book {
    static String libraryName;
    String title;
    String author;
    final int isbn;
    Book(String libraryName,String title,String author,int isbn){
        this.libraryName=libraryName;
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }

    void displayLibraryName() {
        if (this instanceof Book) {
            System.out.println("Library Name : " + libraryName);
            System.out.println("Title: " + title);
            System.out.println("Author : " + author);
            System.out.println("ISBN : "+isbn);
        }
    }

    public static void main(String[] args) {
        Book book=new Book("Central","Impossible","Mohan",5432);
        book.displayLibraryName();


    }
}
