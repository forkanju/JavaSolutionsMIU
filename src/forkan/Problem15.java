package forkan;

public class Problem15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int[] arr = {4,4,3,2,3,4,6,1};
	    System.out.println(evenSum(arr));
	}
	
	static int evenSum(int[] arr) {
		int half = (arr.length)/2;
		int returnVal = 0;
		int prevSum = 0;
		int postSum = 0;
		
		
		if(arr.length % 2 == 0) {
			for(int i = 0; i < half; i++) {
				prevSum += arr[i];
			}
			for(int j = half; j < arr.length; j++) {
				postSum += arr[j];
			}
			if(prevSum == postSum) {
				returnVal = 1;
			}
		
		}
//		  System.out.println("prevSum: "+prevSum);
//		  System.out.println("postSum: "+postSum);
		
		return returnVal;
		
	}

}

/*Question 15
Write a function that will return 1 if an integer array satisfies the following conditions and returns 0 otherwise.
1. it has even numbers of elements
2. Sum of all the numbers in the first half of the array is equal to the sum of all the numbers in the second half of the array.

If you are programming in Java, the function Signature is
int answerThree(int[] a)
Examples
 -------------------|--------|-----------------------------------------------------------------------
| a                 | return | Explanation                                                           |
|-------------------|--------|-----------------------------------------------------------------------|
| {5,4,3,2,3,4,6,1} | 1      | *There are 8 (even) number of elements in the array. Thus condition 1 |
|                   |        | satisfied.                                                            |
|                   |        | *The sum of all the numbers in the first half = 5+4+3+2 = 14          |
 -------------------|--------|-----------------------------------------------------------------------*/