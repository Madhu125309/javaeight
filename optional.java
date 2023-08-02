import java.util.ArrayList;
import java.util.Optional;

public class optional {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("madhu");
        name.add("sudha");
        name.add(null);
        for (int i = 0; i < name.size() - 1; i++) {
            Optional<String> op = Optional.ofNullable(name.get(0));

            if (op.isEmpty()) {
                System.out.println("value is null");
            } else {
                System.out.println(op.get().toUpperCase());
            }
        }
    }
}
