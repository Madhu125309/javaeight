
public class Customer implements User {
    public void login(String name) {
        System.out.println(name);
    }

    public void logout(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        User c = new Customer();
        c.login("ganesh");
        c.logout("rajesh");
        System.out.println(c);
    }
}
