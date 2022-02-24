package Assignment23Feb;
import java.util.function.*;
public class SpaceRemoveInString {
    // Function to remove all
    // spaces from a given string
    static String removeSpace(String str)
    {
        str = str.replaceAll("\\s","");
        return str;
    }
    public static void main(String args[])
    {
        String str = "r emove sp ace ";
        System.out.println(removeSpace(str));
    }
}


