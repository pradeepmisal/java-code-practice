public class Recursion1{
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDec(n-1);
    }
    //Print Number in incresing order
    public static void printInc(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        printInc(n-1);
        System.out.println(n);
    
    }
    //Factorial of no
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        
        int fnm1= fact(n-1);
        int fn= n * fact(n-1);
        return fn;
    }
    //Fibonacci no
    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1= fibonacci(n-1);
        int fnm2= fibonacci(n-2);
        int fn= fnm1+fnm2;
        return fn;
    }
    public static void main(String[] args) {
        int n=5;
        
        System.out.println(fibonacci(5));

    }
}
