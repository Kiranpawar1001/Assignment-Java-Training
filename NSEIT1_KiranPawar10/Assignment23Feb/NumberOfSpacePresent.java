package Assignment23Feb;
import  java.util.Scanner;
public class NumberOfSpacePresent {
    public static void main(String arg []) {
             String str;
            int space= 0;
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter the String  ");
            str=scan.nextLine();
            for(int i=0; i<=str.length(); i++){
                char ch=str.charAt(i);
                if(ch==' '){
                    space++;
                }
            }
            System.out.println("Total white space : "+space);
        }
    }