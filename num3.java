interface TestInterface {
    boolean Test(int a);
}

class num3 {
    static TestInterface i = a -> a > 100;

    public static void main(String[] args) {
        System.out.println(i.Test(140));
    }
}