package week1.Day1.Assignments;

////*******Assignment3****** Part 3
public class PrimeNumber {
	
	// prime number --> the number should divided by itself called prime number.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 13;
		Boolean flag = false;

		for (int i = 2; i <= input / 2; i++) {
			if (input % i == 0)
				flag = true;
			break;
		}
		if (flag == false)
			System.out.println("Prime");
		else 
			System.out.println("Not a Prime");
	}

}
