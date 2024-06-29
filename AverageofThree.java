import java.util.*;
import java.util.Scanner;

public class AverageofThree {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Ener the first no:");
        float A = sc.nextFloat();

        System.out.println("Enter the second no:");
        float B= sc.nextFloat();

        System.out.println("Enter the third no:");
        float C= sc.nextFloat();

        Float Sum = A + B + C;
        double Average = (double) Sum / 3; // Use double for average

        System.out.println("The average of three no is: " + Average);
    }
}
