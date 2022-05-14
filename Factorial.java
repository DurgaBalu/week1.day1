package week1.Day1.Assignments;

////*******Assignment3****** Part 2
public class Factorial {
	
	// Factorial --> multiply given number in reverse sequence order (down) to 1
	// 5 --> 5*4*3*2*1

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 5;
		int fact = 1;

		for (int i = 1; i <= input; i++) {
			fact = fact * i;
		}
		System.out.println("The fact  of 5 is : " + fact);
	}

}