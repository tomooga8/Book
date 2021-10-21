import java.util.ArrayList;
public class Book { //initialization of instance variables
    private String bookTitle;
    private int numCharTitle;
    private String bookAuthor;
    private String bookGenre;
    private int numPages;

    public Book(String title, String author) { //constructor with title and author as parameters and calculates title length
        bookTitle = title;
        bookAuthor = author;
        numCharTitle = title.length(); //calculates title length so that main method does not have to
    }

    public Book(String title, String author, String genre, int pages){ //overloaded constructor with
        bookTitle = title;
        bookAuthor = author;
        bookGenre = genre;
        numPages = pages;
        numCharTitle = title.length(); //calculates title length so that main method does not have to
    }

    public static int addRating(){ //static method that returns a random rating from 0-5
        return (int) (Math.random()*6);
    }


    public static int calcTotalPages(ArrayList<Book> allBooks){ //calculates and adds all the number of pages of each book in list
        int totalNumPages = 0;
        for (int i = 0; i < allBooks.size(); i++){
            totalNumPages += allBooks.get(i).numPages;
        }
        return totalNumPages;
    }
    public static int totalNumCharTitle(ArrayList<Book> allBooks){ //calculates and adds all numCharTitle in an array list
        int totalNumCharTitle = 0;
        for (int i = 0; i < allBooks.size(); i++){
            totalNumCharTitle += allBooks.get(i).numCharTitle;
        }
        return totalNumCharTitle;
    }
    public static String concatFirstCharAuthor(ArrayList<Book> allBooks){ //takes the first char of each author and concats them
        String concatFirstCharAuthor = "";
        for (int i = 0; i < allBooks.size(); i++){
            concatFirstCharAuthor += allBooks.get(i).bookAuthor.substring(0,1);
        }
        return concatFirstCharAuthor;
    }
    public static String concatLastCharTitle(ArrayList<Book> allBooks){ //takes the last char in each title and concatenates them
        String concatLastCharTitle = "";
        for (int i = 0; i < allBooks.size(); i++){
            concatLastCharTitle += allBooks.get(i).bookTitle.substring(allBooks.get(i).bookTitle.length()-1);
        }
        return concatLastCharTitle;
    }

    public static double averageRating(){ //makes three random ratings and averages them
        int bookRating1 = Book.addRating();
        int bookRating2 = Book.addRating();
        int bookRating3 = Book.addRating();
        return (bookRating1 + bookRating2 + bookRating3) /3;
    }

    //getter methods
    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public int getNumPages() {
        return numPages;
    }

    public int getNumCharTitle() {
        return numCharTitle;
    }

}
