package week1.day1Assignments;

public class PositiveNumber {

	public static void main(String[] args) {
		int negative = -20;
		if (negative < 0) {
			System.out.println("The number " + negative + " is converted to " + (-1*negative));
		}
		else {
			System.err.println("The number is already positive");
		}

	}

}
