package LibraryManagement;

/**
 * Created by arouth on 1/7/2018.
 */
public class Book {

    private String title;
    private String author;
    private int count;

    public Book(String title,String author)
    {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean equals(Object o) {


        if (o == this) {
            return true;
        }

        if (!(o instanceof Book)) {
            return false;
        }
        Book b = (Book) o;


        return (getTitle().equalsIgnoreCase(b.getTitle()))
                && (getAuthor().equalsIgnoreCase(b.getAuthor()));
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
