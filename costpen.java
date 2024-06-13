public class costpen{
    public static void main(String[] args) {
        // Define the prices of each item
        float pencilPrice = 5.50f; // Replace with the actual price of a pencil
        float penPrice = 12.75f; // Replace with the actual price of a pen
        float eraserPrice = 3.20f; // Replace with the actual price of an eraser

        // Calculate the total cost
        float totalCost = pencilPrice + penPrice + eraserPrice;

        // Display the bill
        System.out.println("Item\t\tPrice");
        System.out.println("-----------------------");
        System.out.printf("Pencil\t\t$%.2f%n", pencilPrice);
        System.out.printf("Pen\t\t$%.2f%n", penPrice);
        System.out.printf("Eraser\t\t$%.2f%n", eraserPrice);
        System.out.println("-----------------------");
        System.out.printf("Total Cost\t$%.2f%n", totalCost);
    }
}
