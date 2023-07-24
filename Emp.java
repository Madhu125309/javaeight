public class Emp implements User {
    public void login(String name) {
        System.out.println(name);
    }

    public void logout(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        User e = new Emp();
        e.forgetpassword("hey");
        e.login("ravi");
        e.logout("eswar");
        System.out.println(e);
    }
}
