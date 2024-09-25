//import java.util.Scanner;
//
//class library{
//
//    String book[]=new String[5];
//    String BookName;
//    int price;
//    int i=0;
//    Scanner scan=new Scanner(System.in);
//    public void addBook(){
//        System.out.println("Enter the book name and price ; ");
//           this.book[i]=scan.nextLine();
////           this.book[i]=b;
////           price =scan.nextInt();
////           book[i]=BookName;
//           i++;
//        System.out.println("Book addeds");
//    }
//    public void availbook(){
//
//      for (String b:this.book){
//          if(b==null){
//              break;
//          }
//          System.out.println("Book name is : "+b);
//      }
//    }
//    public void getBOOK(){
//        System.out.println("Enter book name ");
//        String s= scan.nextLine();
//        for(int i=0;i<this.book.length;i++) {
//            if (this.book[i].equals(s)) {
//                System.out.println("book Found \n ***Book get Successfuly **");
//                this.book[i] = null;
//                return;
//
//            }
//        }
//        }
//
//    public void returnbook(){
//
//        //  addBook();
//        System.out.println("Enter book which want to returned ");
//        String newbook=scan.nextLine();
//        book[i]=newbook;
//    }
//}
//public class Library_management {
//    public static void main(String[] args) {
//        library l=new library();
//        l.addBook();
//        l.addBook();
//        l.addBook();
//        l.availbook();
//        l.getBOOK();
//        l.availbook();
////        l.returnbook();
////        l.availbook();
//    }
//}

class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+ " has been added!");
    }

    void showAvailableBooks(){
        System.out.println("Available Books are:");
        for (String book : this.books) {
            if (book == null){
                continue;
            }
            System.out.println("* " + book);
        }
    }

    void issueBook(String book){
        for (int i=0;i<this.books.length;i++){
            if (this.books[i].equals(book)){
                System.out.println("The book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist");
    }

    void returnBook(String book){
        addBook(book);
    }

}
public class Library_management {
    public static void main(String[] args) {
        // You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books

        Library centralLibrary = new Library();
        centralLibrary.addBook("Think and grow Rich");
        centralLibrary.addBook("Algorithms");
        centralLibrary.addBook("C++");
        centralLibrary.showAvailableBooks();

        centralLibrary.issueBook("C++");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBook("C++");
        centralLibrary.showAvailableBooks();
    }
}
