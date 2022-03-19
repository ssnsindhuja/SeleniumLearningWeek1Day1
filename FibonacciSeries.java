package week1.day1Assignments;

public class FibonacciSeries {
	public static void main(String[] args) {

		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
		int range = 10; int firstNum = 0; int secNum = 1; int sum;

		// Print first number
		System.out.println(firstNum);
		// Iterate from 1 to the range
		
		for(int i = 1; i < range; i++) {
			sum = firstNum+ secNum;
			firstNum = secNum;
			secNum = sum;
			System.out.println(sum);
		}
		
		// add first and second number assign to sum

		// Assign second number to the first number

		// Assign sum to the second number
		
		// print sum

	}

}
