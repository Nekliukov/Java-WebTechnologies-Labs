package by.bsuir.nekliukov.classes_and_objects.task12;

import by.bsuir.lr1.classes_and_objects.task12.util.Book;
import by.bsuir.lr1.classes_and_objects.task16.util.BooksComparator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void testToString() {
        Book book = new Book("C# 4.5","Herbert Bullschildt",
                450, 651000);
        assertEquals("C# 4.5 - Herbert Bullschildt. Price: 450", book.toString());
    }

    @Test
    public void testHashCode() {
        Book firstBook = new Book("C# 4.5","Herbert Bullschildt",
                450, 651000);
        Book secondBook = new Book("clr via C#","Jeffrey Richter",
                1000, 651001);
        // Don't know any variants how to check hashcode, just let it be here
        assertNotEquals(firstBook.hashCode(), secondBook.hashCode());
    }

    @Test
    public void testEquals() {
        Book firstBook = new Book("C# 4.5","Herbert Bullschildt",
                450, 651000);
        Book secondBook = new Book("clr via C#","Jeffrey Richter",
                1000, 651001);
        Book firstBookClone = new Book("C# 4.5","Herbert Bullschildt",
                450, 651000);

        assertTrue(firstBook.equals(firstBookClone));
        assertFalse(firstBook.equals(secondBook));
    }

    @Test
    public void testBookComparableForSorting(){
        TreeSet<Book> bookSet = new TreeSet<>();
        bookSet.add(new Book("C# 4.5","Herbert Bullschildt",450, 651000));
        bookSet.add(new Book("clr via C#","Jeffrey Richter",1000, 451012));
        bookSet.add(new Book("C# for professionals","John Skeet",2000, 991067));
        bookSet.add(new Book("Delphi for beginners","Dmiriy Surkov",200, 391912));

        //If we use TreeSet, it will insert new elements using Book type comparable interface realisation
        for (Book book: bookSet) {
            System.out.println(book.toString());
        }

    }

    @Test
    public void testBookWithComparatorsForSorting(){
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("C# 4.5","Herbert Bullschildt",450, 651000));
        books.add(new Book("clr via C#","Roman Nekliukov",42, 451013));
        books.add(new Book("clr via C#","Jeffrey Richter",1000, 451012));
        books.add(new Book("clr via C#","Aaron Ramsey",42, 451013));
        books.add(new Book("Visual basic fundamentals","Roman Nekliukov",5400, 451014));
        books.add(new Book("Visual basic fundamentals","Roman Nekliukov",4800, 451015));
        books.add(new Book("C# for professionals","John Skeet",2000, 991067));
        books.add(new Book("Delphi for beginners","Dmiriy Surkov",200, 391912));

        //If we use TreeSet, it will insert new elements using Book type comparable interface realisation
        System.out.println("--------- Random sequence of books ---------");
        printCollection(books);
        System.out.println("--------- Sort books buy author ---------");
        books.sort(new BooksComparator().byAuthor);
        printCollection(books);
        System.out.println("--------- Sort books buy title ---------");
        books.sort(new BooksComparator().byTitle);
        printCollection(books);
        System.out.println("--------- Sort books buy author than by title ---------");
        books.sort(new BooksComparator().byAuthorThanTitle);
        printCollection(books);
        System.out.println("--------- Sort books buy title than by author ---------");
        books.sort(new BooksComparator().byTitleThanAuthor);
        printCollection(books);
        System.out.println("--------- Sort books buy author than by title than by price ---------");
        books.sort(new BooksComparator().byAuthorThanTitleThanPrice);
        printCollection(books);
    }


    @Test
    public void testBookWithComparatorsForSorting2(){
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Bisual basic fundamentals","Roman Nekliukov",5400, 451014));
        books.add(new Book("Aisual basic fundamentals","Roman Nekliukov",4800, 451015));
        books.add(new Book("Visual basic fundamentals","Roman Nekliukov",5400, 451014));
        books.add(new Book("Visual basic fundamentals","Roman Nekliukov",4800, 451015));
        books.add(new Book("C# for professionals","Roman Nekliukov",2000, 991067));
        books.add(new Book("Delphi for beginners","Roman Nekliukov",200, 391912));

        System.out.println("--------- Random sequence of books ---------");
        printCollection(books);
        books.sort(new BooksComparator().byAuthorThanTitle);
        System.out.println("--------- Sorted ---------");
        printCollection(books);

    }

    public void printCollection(ArrayList<Book> books){
        for (Book book: books) {
            System.out.println(book.toString());
        }
        System.out.println();
    }
}