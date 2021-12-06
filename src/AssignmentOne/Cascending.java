//Write a Java program for sorting a given list of names in ascending order?
package AssignmentOne;
import java.util.*;
public class Cascending {
    public static void main(String[] args){
        String str[];
        int n;
        Scanner scr=new Scanner(System.in);
        System.out.print("\nEnter how many strings do you want to take:");
        n=scr.nextInt();
        str=new String[n];
        System.out.println("\nEnter Strings:");
        for(int i=0;i<n;i++)
            str[i]=scr.next();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(str[i].compareTo(str[j])>0)
                {
                    String t=str[i];
                    str[i]=str[j];
                    str[j]=t;
                }
            }
        }
        System.out.println("\nSorted order of strings are:");
        for(int i=0;i<n;i++)
            System.out.println(str[i]);
        }
    }

