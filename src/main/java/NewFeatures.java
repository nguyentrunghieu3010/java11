import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NewFeatures {

    /**
     * https://www.baeldung.com/java-11-new-features
     * @param args
     */
    public static void main(String[] args) {
        newStringMethods();
        collectionToArray();
        notPredicateMethod();
        localVariableSyntaxLambda();
    }

    private static void newStringMethods() {
        String multiLineString = "I will \n helps \n \n developers \n explore Java.";
        List<String> lines = multiLineString.lines()
                .filter(line -> !line.isBlank())
                .map(String::strip)
                .collect(Collectors.toList());
        lines.forEach(System.out::println);
    }

    private static void collectionToArray() {
        List<String> newList = Arrays.asList("Java8", "Java11");
        String[] newArray = newList.toArray(String[]::new);
        for (String s : newArray) {
            System.out.println(s);
        }
    }

    private static void notPredicateMethod() {
        List<String> listString = Arrays.asList("Java 8", "\n \n", "Java 11", " ", "");
        List<String> listStringNoBlanks = listString.stream()
                .filter(Predicate.not(String::isBlank))
                .collect(Collectors.toList());
        listStringNoBlanks.forEach(System.out::println);

    }

    private static void localVariableSyntaxLambda() {
        List<String> stringList = Arrays.asList("Java 8", "Java 11");
        String resultString = stringList.stream()
                .map((var x) -> x.toUpperCase())
                .collect(Collectors.joining(", "));
        System.out.println("Result:" + resultString);

    }
}
