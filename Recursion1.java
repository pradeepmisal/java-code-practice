<<<<<<<<< Temporary merge branch 1
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
=========
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
    // Sort the Given arry
    public static boolean isSorted(int arr[], int i){

        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }
    //First Occurnece of element in the Array
    public static int occur(int arr[], int i, int key){
        if (arr[i]==key){
            return i;
        }
        if(i==arr.length){
            return i;
        }
        
        return occur(arr,i+1, key);
    }
     //print x**n
     public static int power(int x, int n){
        if(n==0){
            return 1; // base case 
        }
        int xnm1=  power(x,(n-1));
        int xn= x * xnm1;
        return xn ;
        //another way
        // return x * power(x, n-1); //internal call
     }
     //Friends pairing
     public static int FriendsPair(int n){
        if(n==1 || n==2){
            return n;
        }
        //Direct way
        // return FriendsPair(n-1) + (n-1) * FriendsPair(n-2);
        //another way 
        //first pair
        int fnm1= FriendsPair(n-1);

        //second pair 
        int fnm2 = FriendsPair (n-2 );
        
        int totalPair = fnm1 + (n-1)* fnm2;
        return totalPair;

     }
     //Q1
     public static void keyocc(int arr[], int key, int i) {
        if(i==arr.length){
            return ; 
        }    
        if (arr[i] == key) {
                System.out.println(String.valueOf(i));
            }
        keyocc (arr, key, i+1);
    }
    // We are given a string S, we need to find the count of all contiguous substrings
//starting and ending with the same character

public static void contiguousString(String str){
    if (str.length()== 0){
        return ;
    }
    
     contiguousString(str.substring(1)+1);
}
    public static void main(String[] args) {
        String str = "abcab";
        contiguousString(str);
        System.out.println(str);
    }
}
