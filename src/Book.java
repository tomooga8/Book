import java.util.ArrayList;
import java.util.Arrays;

public class Book { //initialization of instance variables
    private String bookTitle;
    private int numCharTitle;
    private String bookAuthor;
    private String bookGenre;
    private ArrayList<Integer> rating;
    private double averageRating;
    private int numPages;

    public Book(String title, String author) { //constructor with title and author as parameters and calculates title length
        bookTitle = title;
        bookAuthor = author;
        numCharTitle = title.length(); //calculates title length so that main method does not have to
        rating = new ArrayList<>(Arrays.asList(Book.addRating(), Book.addRating(), Book.addRating())); //uses addRating method and creates a rating arraylist
        averageRating = (rating.get(0) + rating.get(1) + rating.get(2))/(double)rating.size(); //uses the rating array and finds average
    }

    public Book(String title, String author, String genre, int pages){ //overloaded constructor with
        bookTitle = title;
        bookAuthor = author;
        bookGenre = genre;
        numPages = pages;
        numCharTitle = title.length(); //calculates title length so that main method does not have to
        rating = new ArrayList<>(Arrays.asList(Book.addRating(), Book.addRating(), Book.addRating())); //uses addRating method and creates a rating arraylist
        averageRating = (rating.get(0) + rating.get(1) + rating.get(2))/(double)rating.size(); //uses the rating array and finds average
    }

    public static int addRating(){return (int) (Math.random()*6);} //static method that returns a random rating from 0-5

    public static int calcTotalPages(ArrayList<Book> allBooks){ //calculates and adds all the number of pages of each book in list
        int totalNumPages = 0;
        for (Book book: allBooks) totalNumPages += book.numPages; //for-each loop that iterates through each book
        return totalNumPages;
    }
    public static int totalNumCharTitle(ArrayList<Book> allBooks){ //calculates and adds all numCharTitle in an array list
        int totalNumCharTitle = 0;
        for (Book book: allBooks) totalNumCharTitle += book.numCharTitle; //for-each loop that iterates through each book
        return totalNumCharTitle;
    }
    public static String concatFirstCharAuthor(ArrayList<Book> allBooks){ //takes the first char of each author and concats them
        String concatFirstCharAuthor = "";
        for (Book book: allBooks) concatFirstCharAuthor += book.bookAuthor.substring(0, 1); //for-each loop that iterates through each
        return concatFirstCharAuthor;
    }
    public static String concatLastCharTitle(ArrayList<Book> allBooks){ //takes the last char in each title and concatenates them
        String concatLastCharTitle = "";
        for (Book book: allBooks) concatLastCharTitle += book.bookTitle.substring(book.bookTitle.length() - 1); //for-each loop that iterates through each book
        return concatLastCharTitle;
    }
    public static double averageAllRating(ArrayList<Book> allBooks){
        //takes each averageRating instance from Book objects from array and adds them together and averages them
        double sumOfAverageRating = 0.0;
        for (Book book: allBooks) sumOfAverageRating += book.averageRating;
        return sumOfAverageRating / allBooks.size();
    }


    //standard instance variable getter methods
    public String getBookTitle() {return bookTitle;}
    public String getBookAuthor() {return bookAuthor;}
    public String getBookGenre() {return bookGenre;}
    public int getNumPages() {return numPages;}
    public int getNumCharTitle() {return numCharTitle;}

}
