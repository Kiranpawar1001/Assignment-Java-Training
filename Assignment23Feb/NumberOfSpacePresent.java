package Assignment23Feb;
import  java.util.Scanner;
import java.util.function.Function;

public class NumberOfSpacePresent {
    public static void main(String arg []) {
        String str="K  i r a n  P a w a  r";
        Function<String,Integer> f = s1->s1.length()-s1.replaceAll("\\s","").length();
        System.out.println("Space Removed :" + f.apply(str));
    }
        }
