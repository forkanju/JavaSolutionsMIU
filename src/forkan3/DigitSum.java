package forkan3;

public class DigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		System.out.println(isDigitSum(124,5));
	}
	
	public static int isDigitSum(int first, int second) {
		int lastDigit = 0;
		int sum = 0;
		
		while(first > 0) {
		
			lastDigit = first % 10;//to get last digit of any given number 
			sum  += lastDigit;
			first = first/10;
			
		}
		if(sum > second) {
			return 0;
		}
		
		return 1;
	}
	

}


/*1. Write a function named isDigitSum that returns 1 if sum of all digits of the first argument is
less than the second argument and 0 otherwise. For example isDigitSum(32121,10 ) would
return 1 because 3+2+1+2+1 = 9 < 10.
More examples:
isDigitSum(32121,9) returns 0, isDigitSum(13, 6) returns 1, isDigitSum(3, 3) returns 0
The function should return -1 if either argument is negative, so isDigitSum(-543, 3) returns -1.
The function signature is
int isDigitSum(int n, int m)*/