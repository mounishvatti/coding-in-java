import java.io.*;
import java.util.*;
//check whether a string is a palindrome using StringBuilder.
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder string = new StringBuilder(str);
        string.reverse();
        String rev = string.toString();
        if (str.equals(rev)){
            System.out.println("Yes it's a palindrome"); 
        }
        else System.out.println("No it's not a palindrome");          
    }
}
