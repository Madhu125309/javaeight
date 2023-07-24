interface User {
    public abstract void login(String name);

    public abstract void logout(String name);

    default void forgetpassword(String name) {
        System.out.println("hello default"); // default method
    }

}

class Test1 implements User {
    public void login(String name) {
        System.out.println(name);
    }

    public void logout(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.login("madhu");
        t.logout("reddy");
        t.forgetpassword("hi");
        System.out.println(t);
    }
}
