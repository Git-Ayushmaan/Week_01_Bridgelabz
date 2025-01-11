import java.util.Scanner;

public class ItemEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		//Taking unitPrice as an input
        System.out.println("Provide the unitPrice:");
        double unitPrice = sc.nextDouble();
		
		//Taking quantity as an input
        System.out.println("Provide the Quantity of an item:");
        int quantity = sc.nextInt();
		
		//output statement  
        System.out.println("Total purchase price of n itmes is:" + unitPrice * quantity);

    }
}
