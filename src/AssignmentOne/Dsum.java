//Write a Java program that reads a line of integers and then displays eachinteger and the sum of all integers.
package AssignmentOne;
import java.util.*;
import java.lang.*;
public class Dsum {
    public static void main(String[] args) {
        String s="10,20,30,40,50";
        int sum=0;
        StringTokenizer a=new StringTokenizer(s,",",false);
        System.out.println("integers are ");
        while(a.hasMoreTokens())
        {
            int b=Integer.parseInt(a.nextToken());
            sum=sum+b;
            System.out.println(" "+b);
        }
        System.out.println("sum of integers is "+sum);

    }
}
