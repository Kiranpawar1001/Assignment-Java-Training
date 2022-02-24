package Assignment23Feb;
import java.util.stream.Stream;
public class NameStartWithK {
    public static void main(String[] args)
    {
        String[] arr = { "Kettle", "For", "Kittls" };
        // Given String
        String str = "KettleForKittls";
        // Convert the Prefixes into Stream using Stream.of()
        // and check if any prefix matches using Predicate
        // str::startsWith
        if (Stream.of(arr)
                .anyMatch(str::startsWith))
            System.out.println("Given String "
                    + "starts with one of the k.");
        else
            System.out.println("Given String do not "
                    + "starts with one of the prefixes.");
    }
}


