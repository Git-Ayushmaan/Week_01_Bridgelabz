public class VolOfEarth {
    public static void main(String[] args) {
		
		//declaring variable and assigning values 
        int radiusInKms = 6378;
		
		//calculating radius in miles
        double radiusInMiles = radiusInKms * 1.6;
		
		//calculating volume in kms
        double volumeInKms = (4.0/3.0)*3.14*Math.pow(radiusInKms,3);
		
		//calculating volume in miles
        double volumeInMiles = (4.0/3.0)*3.14*Math.pow(radiusInMiles,3);
		
		//output statement 
        System.out.println("The volume of earth in cubic kilometers is:"+volumeInKms+" "+ "and cubic miles is:"+ volumeInMiles);
    }
}
