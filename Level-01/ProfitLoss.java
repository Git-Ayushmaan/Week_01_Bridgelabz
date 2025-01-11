public class ProfitLoss {
    public static void main(String[] args) {
		
		//declaring variables and assigning values 
        int costPrice = 129 ;
        int sellingPrice = 191;
        int profit = sellingPrice - costPrice;
		
		//calculating profit percentage 
        double profitPercentage = ((float)profit/costPrice) * 100;
		
		//declaration
        System.out.println("The Cost Price is INR 129 and Selling Price is INR 191");
		
		//output statement 
        System.out.println("The Profit is INR:"+profit + " " + "and the Profit Percentage is:"+ profitPercentage);
    }
}
