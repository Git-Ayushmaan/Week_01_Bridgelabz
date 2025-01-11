import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		//Taking nunber if chocolates as user input 
        System.out.println("Enter number of choclates : ");
        int NoOfChoclate = sc.nextInt();


		//Taking number of childrens as user input
        System.out.println("Enter number of childrens : ");
        int NoOfChildren = sc.nextInt();

		//calculating chocolates per child and remaining number of chocolates
        int chocolatesPerChild = NoOfChoclate / NoOfChildren;
        int remainingChocolates = NoOfChoclate % NoOfChildren;

		//output statement
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are " + remainingChocolates);

    }
}
