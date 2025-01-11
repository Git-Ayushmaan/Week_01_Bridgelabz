public class AvgOfMarks {
    public static void main(String[] args) {
		
		//creating needed varaiables and assigning values 
        int marksInMaths = 94;
        int marksInPhysics = 95;
        int marksInChemistry = 96;

		//Calculating avg marks 
        double avgMarks = (marksInMaths + marksInPhysics +marksInChemistry)/3;
		
		//output Statement
        System.out.println("Sam’s average mark in PCM is :" + avgMarks);
    }
}
