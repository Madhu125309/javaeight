@FunctionalInterface
interface TestI {
    public abstract boolean Test(int a);

}

class Test implements TestI {
    public boolean Test(int a) {
        if (a > 100) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Test a = new Test();
        System.out.println(a.Test(110));
    }

}
