package forkan;

/**forkan / MIU
 * 01 Sept 2022 @pran-rfl-group*/

public class NextPerfectSqure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number = -5;
		 int nextPerfectSquare = 0;
		 
		   if (number >= 0) {
	            double sqrtResult = Math.sqrt(number);
	            int baseNumber = (int) sqrtResult;
	            int nextNumber = baseNumber + 1;
	            nextPerfectSquare = (int) Math.pow(nextNumber, 2);
	            
	            //debugging
	            System.out.println("sqrtResult: "+sqrtResult);
	            System.out.println("baseNumber: "+baseNumber);
	            System.out.println("nextNumber: "+nextNumber);
	        }

		   System.out.println("nextPerfectSquare: "+nextPerfectSquare);
	}

}

/*
 * Question 7
Write a function nextPerfectSquare that returns the first perfect square that is greater than
it's integer argument. A perfect square is an integer that is equal to some integer squared.

For example 16 is a perfect square because 16 = 4*4. However 15 is not a perfect square because
there is no integer n such that 15 = n*n.

The signature of the function is
int isPerfectSquare(int n)
Examples
 -------------------------|--------------------------------------------------------------
| n                       | next perfect square                                          |
|-------------------------|--------------------------------------------------------------|
| 6                       | 9                                                            |
|-------------------------|--------------------------------------------------------------|
| 36                      | 49                                                           |
|-------------------------|--------------------------------------------------------------|
| 0                       | 1                                                            |
|-------------------------|--------------------------------------------------------------|
| -5                      | 0                                                            |
 -------------------------|--------------------------------------------------------------*/
 