public class PenDivision {
    public static void main(String[] args) {
		
		//declaring variable and their values 
        int noOfStudents = 3;
        int noOfPen = 14;
		
		//calculating no of pen distributed equally
        int noOfPenDistributedEqually = 14 /3;
		
		//calculating remaining no of pens
        int remainingNoOfPens = 14 % 3;
		
		//output st	atement
        System.out.println("The Pen Per Student is " + noOfPenDistributedEqually +" " + "and the remaining pen not distributed is " + remainingNoOfPens);

    }
}
