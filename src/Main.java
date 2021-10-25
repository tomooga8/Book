import java.util.ArrayList;
public class Main {
    public static void main(String[] arg){
        Book untamed = new Book("Untamed","Glennon Doyle", "Fiction", 352);
        Book meetCute = new Book("Meet Cute Diary", "Emery Lee", "romance", 400);
        Book ofMiceAndMen = new Book("Of Mice and Men", "John Steinbeck");
        Book abbeyLussier = new Book("The Trials and Tribulations of Being Abbey Lussier",
                "Tomo Oga");

        ArrayList<Book> allBookList = new ArrayList<>();
        allBookList.add(untamed);
        allBookList.add(meetCute);
        allBookList.add(ofMiceAndMen);
        allBookList.add(abbeyLussier);

        System.out.println("Total number of pages: " + Book.calcTotalPages(allBookList));
        System.out.println("The total number of characters in all of the book titles: " +  Book.totalNumCharTitle(allBookList));
        System.out.println("The first letter of each authors name: " + Book.concatFirstCharAuthor(allBookList));
        System.out.println("The last letter of each book title: " + Book.concatLastCharTitle(allBookList));
        System.out.println("The average rating for all of the books: " + Book.averageAllRating(allBookList));



    }
}
