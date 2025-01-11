import java.util.Scanner;

public class UniversityFeeDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		//declaring variable
        double fee;
		
		//taking fee as user input 
        System.out.println("Enter fee:");
        fee = sc.nextDouble();
        double discountPercentage;
		
		//taking discountPercentage as user input
        System.out.println("Enter Discount Percentage");
        discountPercentage = sc.nextDouble();
		
		//calculate discount
        double discount = (discountPercentage * (fee/100));
		
		//calculate discountedFee 
        double discountedFee = fee - discount ;
		
		//output statement
        System.out.println(" The discount amount is INR" + " " + discount + " " + "and final discounted fee is INR" + " " + discountedFee);

    }
}
