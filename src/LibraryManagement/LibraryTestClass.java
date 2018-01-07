package LibraryManagement;

/**
 * Created by arouth on 1/7/2018.
 */
public class LibraryTestClass {
    public static void main(String[] args) throws Exception
    {
        LibraryManagement lm = LibraryManagement.getInstance();
        lm.addBook("5. someone","Chetan Bhagat");
        lm.addBook("abc","anir");
        lm.addBook("abc","anir");
        lm.addBook("abc","anir");
        lm.addBook("cbd","anjali");
        lm.addBook("cbd","anjali");
        lm.addBook("lmk","ashish");
        lm.addBook("dfg","Kiran");
        lm.addBook("dfg","Kiran");

//        System.out.println(lm.getBook("abc","anir"));
//        System.out.println(lm.getBook("abc","anir").getCount());
//        System.out.println(lm.getBook("abc","chd"));

        lm.addUser("Anup");
        lm.addUser("Virat");
        lm.addUser("Mahesh");

//        System.out.println(lm.getUser("mahesh"));
//        System.out.println(lm.getUser("Ajay"));
//        System.out.println(lm.getBook("abc","anir").getCount());
//        lm.lendBook("abc","anir","mahesh");
//        System.out.println(lm.getBook("abc","anir").getCount());
//        lm.returnBook("abc","anir","mahesh");
//        System.out.println(lm.getBook("abc","anir").getCount());
//
        LibraryManagement.setMaxBooksToUser(1);
        lm.lendBook("abc","anir","mahesh");
        lm.lendBook("abc","anir","mahesh");




    }
}
