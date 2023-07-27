interface TestI {
    public default void m1() {
        System.out.println("hai");
    }

    public static void m2() {
        System.out.println("hey");
    }

    public static void m3() {
        System.out.println("hi");
    }
}

public class Test2 {
    public static void main(String[] args) {
        TestI.m2();
        TestI.m3();
    }
}
