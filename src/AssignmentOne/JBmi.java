//Write a Java program to compute body massindex (BMI).
// Note: The formula is BMI = kg/m2where kg is a person's weight in kilograms and m2is their height in metres squared.
package AssignmentOne;
import java.util.Scanner;
public class JBmi {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input weight in kilogram: ");
        double weight = sc.nextDouble();
        System.out.print("\nInput height in meters: ");
        double height = sc.nextDouble();
        double BMI = weight / (height * height);
        System.out.print("\nThe Body Mass Index (BMI) is " + BMI + " kg/m2");
    }
}

