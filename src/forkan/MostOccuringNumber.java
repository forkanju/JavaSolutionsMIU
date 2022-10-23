package forkan;

public class MostOccuringNumber {

	  public static void main(String[] args){
	    int[] arr = { 40, 50, 30, 60, 60};
	    System.out.print(mostFrequent(arr));
	  }

	private static int mostFrequent(int[] arr) {
		 int maxCount = 1; //need to compare is count greater than maxCount or not
		 int maxOccur = 0;
		
		 for(int i = 0; i < arr.length; i++) {
			 int count = 0;
			 for(int j = 0; j < arr.length; j++) {
				 if(arr[i] == arr[j]) {
					 count++;
					// System.out.println(count);
				 }
			 }
			 
			 if(count > maxCount) {
				 //System.out.println(count);
				 maxCount = count;
				 maxOccur = arr[i];
		
			 }
		
		 }
	
		return maxOccur;
	}

}

/*Question 14
Write a function that will return the most occurring number in an array. If there is more than
one such number, the function may return any one of them.
If you are programming in Java or C#, the function signature is int answerTwo(int[] a)

Examples
 -------------------------|----------|------------------------------------------------------------
| a                       | return   | Explanation                                                |
|-------------------------|----------|------------------------------------------------------------|
| {6,8,1,8,2}             | 8        | 8 occurs two times. No other number occurs 3 or more times |
|-------------------------|----------|------------------------------------------------------------|
| {6,8,1,8,6}             | 8 or 6   | 8, 6. The Function may return either 8 or 6                |
 -------------------------|----------|------------------------------------------------------------*/