package forkan3;

public class Evens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isEvens(6248421));
	}
	
	public static int isEvens(int num) {
		int lastDigit = 0;
	
		while(num > 0) {
			lastDigit = num % 10;
			if(lastDigit % 2 != 0)return 0;
			num = num / 10;
		}

		return 1;
	}

}

/*1. An Evens number is an integer whose digits are all even. For example 2426 is an Evens
number but 3224 is not.
Write a function named isEvens that returns 1 if its integer argument is an Evens number
otherwise it returns 0.
The function signature is
int isEvens (int n)
*/