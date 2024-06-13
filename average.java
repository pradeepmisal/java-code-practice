import java.util.*;
import java.util.Scanner;
//Write a Java method to compute the average of three numbers..

public class average{
    private static Num1 num2;
    /**
     * @param args
     */
    public static void  main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Emter the first no:");
        int Num1 = sc.nextInt();

        System.out.println("Emter the second no:");
        int Num2 = sc.nextInt();

        System.out.println("Emter the firsdt no:");
        int Num3 = sc.nextInt();

    }
    public static int average(Num1 Num2 Num3){
        num2 = Num2;
    
        return (Num1+Num2+Num3)/3;

    }

}


