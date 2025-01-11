import java.util.Scanner;

public class MaxHandshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		//Taking no of Students as user input
        System.out.println("Enter no of students:");
        int noOfstudents = sc.nextInt();
		
		//output statement with result 
        System.out.println("Maximum Possible no of Handshakes:"+  (noOfstudents * (noOfstudents - 1)) / 2);
    }
}
