package week1.Day1.Assignments;

// *******Assignment2****** Part 1
public class Car {

	public void applyBreak() {
		System.out.println("This is Apply Break Method");
	}
	public void applyGear() {
		System.out.println("This is Apply Gear Method");
	}
	public void switchonAc() {
		System.out.println("This is Switch On AC Method");
	}
	public void applyAcclerate () {
		System.out.println("This is Apply Acclerate Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*** This is Main Method of Car Class ***");
		
		Car vehicle = new Car();
		vehicle.applyBreak();
		vehicle.applyGear();
		vehicle.switchonAc();
		vehicle.applyAcclerate();
		
	}

}
