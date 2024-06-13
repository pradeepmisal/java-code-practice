import java.util.*;
import java.util.Scanner;


public class even{
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the integer no:");
        num = sc.nextInt();
        if(isEven(num)){
            System.out.println("the numeber is even");
        }
        else{
            System.out.println("the numeber is odd");
        }
        }
        public static boolean isEven(int number) {
            
            if(number % 2 == 0) {
            return true;
            }
            else {
            return false;
            }
            }
            }
