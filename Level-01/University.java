public class University {
    public static void main(String[] args) {
		
		//declaring variable and assigning values
        int fee = 125000;
        double discountPercentage = 10;
		
		//calculating discounr
        double discount = (fee * (1/discountPercentage));
		
		//calculating discountedFee
        double discountedFee = fee - discount ;
		
		//output statement
        System.out.println(" The discount amount is INR" + " " + discount + " " + "and final discounted fee is INR" + " " + discountedFee);

    }
}
