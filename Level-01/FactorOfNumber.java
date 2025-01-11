import java.util.Scanner;

public class FactorOfNumber {
    public static void main(String[] args) {
		//creating a scanner class object
        Scanner sc = new Scanner(System.in);
		
		//Taking inputs from user
		System.out.println("Enter a number ");
		int number=sc.nextInt();
	    int maxFactor=10;
		//creating an array of factors
		int[] factors=new int[maxFactor];
        int index = 0;

		for(int i=1;i<=number;i++){
		   //check factors of number 
            if (number%i == 0) {
				if (index == maxFactor) {
				// increase the size of maxFactor
                    maxFactor*= 2;
                    int[] tempArray = new int[maxFactor];
                    for (int j=0;j<factors.length;j++) {
                        tempArray[j] = factors[j];
                    }
                    factors = tempArray;
                }
				factors[index++]=i;
				}
        }
		
		// Print the Factors of number
        System.out.println("Factors of " + number );
        for (int i=0;i<index;i++) {
            System.out.println(factors[i] );
        }	
		sc.close();
}
}