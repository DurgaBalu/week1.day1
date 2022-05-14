package week1.Day1.Assignments;


//*******Assignment3****** Part 1
public class FibonacciSeries {

	
	// Fibonacci Series --> add 1st two number , with result of 1st two number, add current result with ,previous number
	// 0, 1, 0+1=1, 1+1=2, 1+2=3, 2+3=5
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstNumber = 0;
		int secondNumber = 1;
		int sum;
		
		System.out.println("The first Number is : " + firstNumber);
		
		for(int i = 0; i <8; i++)
			// 0 1 1 2 3 5 8 13
		{
			 sum = firstNumber + secondNumber ;
			 firstNumber = secondNumber;
			 secondNumber = sum;
			 System.out.println("The Sum is : " + sum);
		}
		
	}

}
