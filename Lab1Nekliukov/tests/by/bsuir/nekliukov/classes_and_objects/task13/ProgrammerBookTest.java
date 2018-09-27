package by.bsuir.nekliukov.classes_and_objects.task13;

import by.bsuir.lr1.classes_and_objects.task12.util.Book;
import by.bsuir.lr1.classes_and_objects.task13.util.ProgrammerBook;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProgrammerBookTest {

    @Test
    public void testToString() {
        ProgrammerBook pBook = new ProgrammerBook("C# 4.5","Herbert Bullshildt",
                450, 651000,"C#", 1);
        assertEquals("C# 4.5 - Herbert Bullshildt. Price: 450(Language  C#, level: 1)", pBook.toString());
    }

    @Test
    public void testHashCode() {
        Book book = new Book("C# 4.5","Herbert Bullshildt",
                450, 651000);
        ProgrammerBook pBook = new ProgrammerBook("C# 4.5","Herbert Bullshildt",
                450, 651001, "C#", 1);
        assertNotEquals(pBook.hashCode(), book.hashCode());
    }

    @Test
    public void testEquals() {
        ProgrammerBook firstBook = new ProgrammerBook("C# 4.5","Herbert Bullschildt",
                450, 651000, "C#", 1);
        ProgrammerBook secondBook = new ProgrammerBook("C# 4.5","Herbert Schildt",
                450, 651001,"C#", 1);

        assertFalse(firstBook.equals(secondBook));
        assertTrue(firstBook.equals(firstBook));
    }
}