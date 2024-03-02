import java.util.Scanner;


class OnlineLibrary {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.logo();
        lib.addBook();
        lib.showAvailableBooks();
        lib.issueBook();
    }
}

class Library {

    // String[] books = new String[100];
    // int bookCount = 0;

    String[] availableBooks = new String[100];
    int availableBookCount = 0;

    String[] issuedBooks = new String[100];
    int issuedBookCount = 0;

    Scanner input = new Scanner(System.in);

    int userInput; 

    // function for displaying a library logo
    public void logo() {
        System.out.println("\n--------- Welcome to my Library! -----------\n");
    }

    // function for add a book in a Library
    public void addBook() {

        System.out.print("Enter your book name: ");
        availableBooks[availableBookCount++] = input.next();
        System.out.println("Successfully! Book Added to Library!");
    }

    // function for issue a book from library
    public void issueBook() {

        showAvailableBooks();

        System.out.print("Choose book: ");
        userInput = input.nextInt();

        if(!(userInput >= 0 && userInput < availableBookCount)) {
            System.out.println("Invalid Input! Try again with the valid input!");
            issueBook();
        }

        issuedBooks[issuedBookCount++] = availableBooks[userInput];

        System.out.println("Book issued Successfully!");

    }

    // function for return a book
    public void returnBook() {

        System.out.println("\nDisplaying all issued Books\n");
        
        for(int i = 0; i < issuedBookCount; ++i) {
            System.out.println(i + " for \"" + issuedBooks[i] + "\"");
        }

        System.out.print("Choose book: ");
        userInput = input.nextInt();

        if(!(userInput >= 0 && userInput < issuedBookCount)) {
            System.out.println("Invalid Input! Try again with the valid input!");
            returnBook();
        }
    }

    // displaying all available books
    public void showAvailableBooks() {
        System.out.println("\nDisplaying all Available Books\n");
        for(int i = 0; i < availableBookCount; ++i) {
            System.out.println(i + " for \"" + availableBooks[i] + "\"");
        }
    }
}