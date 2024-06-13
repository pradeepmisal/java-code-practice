import java.util.*;
import java.util.Scanner;

public class  Factorial{
    public static int Fctorial(int n){
        int f=1;

        for (int i=1; i<=n; i++){
            f = f * i;
        }
        return f;// Return factorial 
    }
    public static void main(String args[]) {
       System.out.println(Fctorial(5));
    }
}