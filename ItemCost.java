import java.util.Scanner;

public class ItemCost {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter quantity of items: ");
        int quantity = input.nextInt();

        System.out.print("Enter price per item: ");
        double price = input.nextDouble();

        double totalCost = quantity * price;

        System.out.println("Total cost: " + totalCost);

        input.close();
    }
}