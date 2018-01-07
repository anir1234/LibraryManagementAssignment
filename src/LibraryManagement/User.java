package LibraryManagement;

/**
 * Created by arouth on 1/7/2018.
 */
public class User {

    private String userName;
    private int userId;
    private int booksBorrowed;

    public User(String userName)
    {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public boolean equals(Object o) {


        if (o == this) {
            return true;
        }

        if (!(o instanceof User)) {
            return false;
        }
        User u = (User) o;


        return getUserName().equalsIgnoreCase(u.getUserName());
    }

    public int getBooksBorrowed() {
        return booksBorrowed;
    }

    public void setBooksBorrowed(int booksBorrowed) {
        this.booksBorrowed = booksBorrowed;
    }
}
