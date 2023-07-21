@FunctionalInterface
interface interface1 {
    public abstract void message(String str);
}

class num2 {

    public static void main(String[] args) {
        interface1 i = (str) -> System.out.println(str);
        i.message("madhu");
    }

}
