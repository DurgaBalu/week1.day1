package week1.Day1.Assignments;

// *******Assignment1******

public class TwoWheeler {
  
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 2510531;
	boolean isPunctured = false;
	String bikeName = "Honda";
	double runningKM = 60000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		TwoWheeler bike = new TwoWheeler();
		System.out.println("*** Twowheeler Details ***");
		System.out.println("noOfWheels = " + bike.noOfWheels);
		System.out.println("noOfMirrors = " + bike.noOfMirrors);
		System.out.println("chassisNumber = " + bike.chassisNumber);
		System.out.println("isPunctured = " + bike.isPunctured);
		System.out.println("bikeName = " + bike.bikeName);
		System.out.println("runningKM =" + bike.runningKM);
		
	}

}
