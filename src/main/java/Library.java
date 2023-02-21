import java.util.ArrayList;
import java.util.Collection;

public class Library {
    private ArrayList<Book> collection;
    private Integer capacity;

    public Library(Integer capacity) {
        this.capacity = capacity;
        this.collection = new ArrayList<Book>();
    }

    public int getBookCount(){
        return this.collection.size();
    }

    public void addBook(Book book) {
        if(this.capacity > this.collection.size()) {
            this.collection.add(book);
        }
    }
}
