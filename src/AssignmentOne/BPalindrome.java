//Write a Java program that checks whether a given string is a palindrome or not. Ex: MADAM is a palindrome?

package AssignmentOne;
import java.util.*;
public class BPalindrome {
    public static void main(String[] args) {
        String rev="";
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        int length = str.length();

        for ( int i = length - 1; i >= 0; i-- )
            rev = rev + str.charAt(i);
        if (str.equals(rev))
            System.out.println(str+" is a palindrome");
        else
            System.out.println(str+" is not a palindrome");

    }


}
