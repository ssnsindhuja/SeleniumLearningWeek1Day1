package week1.day1Assignments;

public class Factorial {

	public static void main(String[] args) {
		// Declare your input as 5
		int input =5;
		int fact = 1;
		for (int i = 1; i <=input; i++) {
			fact = fact*i;
		}
		System.out.println(fact);

	}

}
