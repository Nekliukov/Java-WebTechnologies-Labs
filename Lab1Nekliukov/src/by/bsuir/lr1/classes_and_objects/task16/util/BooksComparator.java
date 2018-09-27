package by.bsuir.lr1.classes_and_objects.task16.util;

import by.bsuir.lr1.classes_and_objects.task12.util.Book;

import java.util.Comparator;

public class BooksComparator
{
    public static Comparator<Book> byAuthor = (book1, book2) -> {
        return book1.author.compareToIgnoreCase(book2.author);
    };

    public static Comparator<Book> byTitle = (book1, book2) -> {
        return book1.title.compareToIgnoreCase(book2.title);
    };

    public static Comparator<Book> byPrice = Comparator.comparingInt(book -> book.price);

    public static Comparator<Book> byTitleThanAuthor = byTitle.thenComparing(byAuthor);
    public static Comparator<Book> byAuthorThanTitle = byAuthor.thenComparing(byTitle);
    public static Comparator<Book> byAuthorThanTitleThanPrice = byAuthor
            .thenComparing(byTitle).thenComparing(byPrice);
}
