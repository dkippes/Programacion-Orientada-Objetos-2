import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        List<String> s = List.of("V", "V", "I", "I", "N");

        String sr = s.stream()
                .reduce(BinaryOperator.maxBy((o1, o2) ->
                        Collections.frequency(s, o1) - Collections.frequency(s, o2)))

                .orElse("U");

        System.out.println(sr);
    }
}
