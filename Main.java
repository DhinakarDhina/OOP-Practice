import java.util.*;

// Book class
class Book {
    public List<String> title;
    public List<String> author;
    private List<Boolean> isAvailable;

    // Parameterized constructor
    Book(List<String> title, List<String> author, List<Boolean> isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    // Borrow book method
    public void borrowBook(String bookName) {
        int index = title.indexOf(bookName);

        if (index != -1) {
            if (isAvailable.get(index)) {
                isAvailable.set(index, false);
            } else {
                System.out.println("Book is not available.");
            }
        }
    }

    // Return book method
    public void returnBook(String bookName) {
        int index = title.indexOf(bookName);

        if (index != -1) {
            isAvailable.set(index, true);
        }
        System.out.println(bookName+" is returned");
    }

    // Get availability method
    public void getAvailability(String bookName) {
        int index = title.indexOf(bookName);

        if (index != -1) {
            System.out.println(isAvailable.get(index));
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        List<String> title = Arrays.asList(
                "Sherlock_Holmes",
                "Frankenstein",
                "King_Arthur_and_the_Round_Table",
                "Treasure_Island"
        );

        List<String> author = Arrays.asList(
                "Arthur_Conan_Doyle",
                "Mary_Shelley",
                "Roger_Lancelyn_Green",
                "Robert_Louis_Stevenson"
        );

        List<Boolean> isAvailable = Arrays.asList(
                false,
                true,
                false,
                false
        );

        // Create Book object
        Book book = new Book(title, author, new ArrayList<>(isAvailable));

        // Method calls
        book.borrowBook("Frankenstein");
        book.borrowBook("Sherlock_Holmes");
        book.returnBook("King_Arthur_and_the_Round_Table");
        book.getAvailability("Sherlock_Holmes");
        book.borrowBook("Frankenstein");
    }
}
