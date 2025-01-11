public class SwapTwoNumbers {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaring variables and assigning values
		System.out.println("Enter the value of number 1:")
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

		//Applying logic 
        int temp = number1;
        number1 = number2;
        number2 = temp;

		//Output statement 
        System.out.println("The swapped numbers are = " + number1 + "  and  " + number2);


    }
}
