import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListExemplo {

    public static void main (String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2,"Marco");

        System.out.println(list.size());

        for (String x : list
             ) {
            System.out.println(x);
        }

        System.out.println("__________________");
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list
             ) {
            System.out.println(x);
        }

        System.out.println("Index of Bob: "  + list.indexOf("Bob"));
        System.out.println("Index of Alex: "  + list.indexOf("Alex"));
        System.out.println("Index of nobody: "  + list.indexOf("Alessandro"));
        System.out.println("__________________");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').toList();

        for (String x : result
        ) {
            System.out.println(x);
        }
        System.out.println("__________________");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}
