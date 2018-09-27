package by.bsuir.lr1.classes_and_objects.task12.util;

public class Book implements Comparable<Book>
{
    public String title ;
    public String author;
    public int price;
    private static int edition;
    private int isbn;

    public Book(String title, String author, int price, int isbn){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    @Override
    public String toString(){
        return title + " - " + author + ". Price: " + price;
    }

    @Override
    public int hashCode(){
        int result = 17;
        result = 31 * result + title.hashCode();
        result = 31 * result + author.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o){
        if(o == this)
            return true;
        if(!(o instanceof Book))
            return false;

        Book book = (Book)o;
        return  book.title == title &&
                book.author == author;
    }

    @Override
    public int compareTo(Book o) {
        if (o == null)
            throw new NullPointerException();

        if (this.isbn - o.isbn > 0)
            return 1;
        if (this.isbn - o.isbn < 0)
            return -1;

        return 0;
    }
}
