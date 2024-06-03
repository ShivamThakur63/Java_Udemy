class LibraryItem<T> {
    private T item;

    public LibraryItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

// Defining types
class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

class Magazine {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

class DVD {
    private String title;

    public DVD(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

public class RealLifeExample {

    public static void main(String[] args) {

        // Usage
        LibraryItem<Book> bookItem = new LibraryItem<>(new Book("Effective Java"));
        Book book = bookItem.getItem();
        System.out.println(book.getTitle()); // Output: Effective Java

        LibraryItem<Magazine> magazineItem = new LibraryItem<>(new Magazine("National Geographic"));
        Magazine magazine = magazineItem.getItem();
        System.out.println(magazine.getTitle()); // Output: National Geographic

        LibraryItem<DVD> dvdItem = new LibraryItem<>(new DVD("Inception"));
        DVD dvd = dvdItem.getItem();
        System.out.println(dvd.getTitle()); // Output: Inception

    }
}