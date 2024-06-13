public class MaxValueFromArray {
    public static void main(String[] args) {
       
        int[] myArray = new int[5];

        
        myArray[0] = 10;
        myArray[1] = 25;
        myArray[2] = 18;
        myArray[3] = 32;
        myArray[4] = 14;

        int max = myArray[0]; 

        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }

        System.out.println("The maximum value in the array is: " + max);
    }
}
