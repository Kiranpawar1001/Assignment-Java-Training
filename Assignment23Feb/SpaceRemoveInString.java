package Assignment23Feb;
import java.util.function.*;
public class SpaceRemoveInString {
    public static void main(String[] args) {
    String s="K  i r a n  P a w a  r";
    Function<String,String> f = s1->s1.replaceAll("\\s","");
        System.out.println("Space Removed :" + f.apply(s));
    }
    }



