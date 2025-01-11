import java.util.*;
public class PowerCalculation{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
				
				System.out.Println("Enter the no:");
				int number =sc.nextInt();
				
				System.out.Println("Enter Power to be plugged:");
				ing power = sc.nextInt();
				
				int result = 1 ;
				
				for (i=1;i<=power;i++){
						result = result * number;
				}
				
				System.out.println(number + " raised to the power of " + power + " is: " + result);
				
		}
}