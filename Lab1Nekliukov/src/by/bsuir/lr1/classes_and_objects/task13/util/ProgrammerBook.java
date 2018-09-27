package by.bsuir.lr1.classes_and_objects.task13.util;

import by.bsuir.lr1.classes_and_objects.task12.util.Book;

public class ProgrammerBook extends Book
{
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price,
                          int isbn, String language, int level) {
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    @Override
    public String toString(){
        return super.toString()+ "(Language  " + language + ", level: " + level + ")";
    }

    @Override
    public int hashCode(){
        return 31 * super.hashCode() * language.hashCode();
    }

    @Override
    public boolean equals(Object o){
        ProgrammerBook pBook = (ProgrammerBook)o;
        return super.equals(pBook) && (pBook.level == level);
    }
}
