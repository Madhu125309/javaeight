@FunctionalInterface
interface interface1 {
    public abstract void message(String str);
}

class num implements interface1 {
    public void message(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        num n = new num();
        n.message("madhu");
    }
}