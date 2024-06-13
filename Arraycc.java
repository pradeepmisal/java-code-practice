import java.util.*;
import java.util.Scanner;

public class Arraycc{
    public static void main(String args[]) {
      int marks[]= new int [100];
      Scanner sc = new Scanner (System.in);
  
      marks[0]= sc.nextInt();
      marks[1]= sc.nextInt();
      marks[2]= sc.nextInt();
      marks[3]= sc.nextInt();

      System.outPrintln("physics: "+ marks[0]);
      System.outPrintln("chemistry : "+ marks[1]);
      System.outPrintln("bio: "+ marks[2]);
      System.outPrintln("Math: "+ marks[3]);


        
    }
}
