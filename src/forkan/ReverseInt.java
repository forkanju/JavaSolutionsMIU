package forkan;



public class ReverseInt {

	  public static void main (String[] args) {
	        System.out.println(reverseIntWithNumericOps(-54321));

	    }

	private static int reverseIntWithNumericOps(int number) {
	
		int reverse = 0;
		if(number == 0) return 0;
		
		while(number != 0) {
			reverse = (reverse * 10) + (number % 10);
			number /= 10;
		}
	
		return reverse;
	}


	}


/*
Question 4
Write a function to reverse an integer using numeric operators and without
using any arrays or other data structures.

The signature of the function is:
int f(int n)
Examples

 --------------------------------|--------------------------------------------------------------
| if the input integer is        | return                                                       |
|--------------------------------|--------------------------------------------------------------|
| 1234                           | 4321                                                         |
|--------------------------------|--------------------------------------------------------------|
| 12005                          | 50021                                                        |
|--------------------------------|--------------------------------------------------------------|
| 1                              | 1                                                            |
|--------------------------------|--------------------------------------------------------------|
| 1000                           | 1                                                            |
|--------------------------------|--------------------------------------------------------------|
| 0                              | 0                                                            |
|--------------------------------|--------------------------------------------------------------|
| -12345                         | -54321                                                       |
 --------------------------------|--------------------------------------------------------------
 **/