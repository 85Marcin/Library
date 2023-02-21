import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;

    private Book book;
    private Book book2;

@Before
    public void before(){
    library = new Library(10);
    book = new Book("Island", "Huxley", "Dystopia");
    book2 = new Book ("What" , "is", "that");

}

@Test
    public void canGetBookCount(){
    assertEquals(0, library.getBookCount());
}
@Test
    public void canAddBook(){
    library.addBook(book);
    library.addBook(book2);

    assertEquals(2, library.getBookCount());
}

}
