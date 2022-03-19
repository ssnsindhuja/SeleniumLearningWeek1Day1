package week1.day1Assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 7;
		boolean flag = false;
		for (int i = 2; i< num/2; i++) {
			if((num%i) == 0) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("Not a prime number");
		}
		else {
			System.out.println("Prime number");
		}

	}

}
