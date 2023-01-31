package class17HW;

public class Book {
    int pages;
    String title;
    String author;

    Book(int bPages,String bTitle,String bAuthor) {
        pages = bPages;
        title=bTitle;
        author=bAuthor;
    }
    Book(int bPages,String bTitle) {
        pages = bPages;
        title = bTitle;
    }
    void displayBookInfo(){
            System.out.println("Title: "+title+" pages: "+pages+" author: "+author);
        }


    /*
    Write Book class that will have instance variables
    and 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed

     */
    public static void main(String[] args) {
        Book book=new Book(199,"Brave New World","Huxley");
        book.displayBookInfo();
        Book book2= new Book(50,"My Bad Book");
        book2.displayBookInfo();
    }

}
