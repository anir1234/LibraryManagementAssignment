package LibraryManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by arouth on 1/7/2018.
 */
public class LibraryManagement {

    private static List<Book> books;
    private static List<User> users;
    private static int maxBooksToUser = 5;
    private static LibraryManagement instance = null;


    static {
        books = new ArrayList<Book>();
        users = new ArrayList<User>();
    }

    private LibraryManagement() {

    }

    public static LibraryManagement getInstance() {
        if (instance == null)
            instance = new LibraryManagement();

        return instance;
    }

    //1. Add books to the System
    public void addBook(String title, String author) {
        Book temp = new Book(title, author);
        if (books.contains(temp)) {
            int index = books.indexOf(temp);
            temp = books.get(index);
            temp.setCount(temp.getCount() + 1);
        } else {
            temp.setCount(1);
            books.add(temp);
        }
    }


    //2. Add Users to the System
    public void addUser(String username) {
        if (users.contains(new User(username))) {
            System.out.println("Username already exists , please choose a different username");
        } else {
            int id = users.size() + 1;
            User temp = new User(username);
            temp.setUserId(id);
            users.add(temp);
        }

    }

    //3. Ability to lend books to users.
    public void lendBook(String bookTitle, String author, String username) throws Exception {
        User tempUser = getUser(username);
        Book tempBook = getBook(bookTitle, author);

        if (tempUser != null && tempBook != null) {
            if (tempUser.getBooksBorrowed() < maxBooksToUser) {
                if (tempBook.getCount() > 0) {
                    tempBook.setCount(tempBook.getCount() - 1);
                    tempUser.setBooksBorrowed(tempUser.getBooksBorrowed() + 1);
                } else {
                    throw new Exception("Book is out of stock , please check after few days");
                }
            } else {
                throw new Exception("Maximum number of books allowed has already been lent to the user");
            }
        }
    }

    //4. Ability to return books to the library.
    public void returnBook(String bookTitle, String author, String username) throws Exception {
        User tempUser = getUser(username);
        Book tempBook = getBook(bookTitle, author);

        if (tempUser != null && tempBook != null) {

            tempBook.setCount(tempBook.getCount() + 1);
            tempUser.setBooksBorrowed(tempUser.getBooksBorrowed() - 1);

        }
    }

    //5. Ability to limit the number of books borrowed by user.
    public static void setMaxBooksToUser(int maxBooks) {
        LibraryManagement.maxBooksToUser = maxBooks;
    }

    //6.Ability to search a book by title, author.
    public Book getBook(String title, String author) throws Exception {
        Book temp = new Book(title, author);
        if (books.contains(temp)) {
            return books.get(books.indexOf(temp));
        } else {
            throw new Exception("No such book in the system, Please check the title and author");
        }
    }

    //7.Ability to search a user by name
    public User getUser(String username) throws Exception {
        User temp = new User(username);
        if (users.contains(temp)) {
            return users.get(users.indexOf(temp));
        } else {
            throw new Exception("No such user exists in our system, please check the username");
        }
    }


    public int getMaxBooksToUser() {
        return maxBooksToUser;
    }


}
