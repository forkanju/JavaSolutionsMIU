package forkan;

public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isSubArray(new int[] {13,6,3,2}));

	}
	
	static int isSubArray(int[] arr) {
		int isSub = 0;

		int restItemSum = 0;
		

		
		for(int i = 0; i < arr.length; i++) {
			isSub = 1;
			for(int j = i+1; j < arr.length; j++) {
				restItemSum += arr[j];
			}
			
			if(arr[i] <= restItemSum) {
				isSub = 0;
				return isSub;
			}
			
			
			restItemSum = 0;
		}
		
		
		return isSub;
	}

}


/*Question 24
A Sub Array is defined to be an array in which each element is greater than sum of all
elements after that. see example below:
{13,6,3,2} is a sub array. Note that 13 > 6+3+2, 6 > 3+2, 3>2.
{11,5,3,2} is NOT a sub array. Note that 5 is not greater than 3+2.
Write a function named isSub that returns 1 if its array argument is a Sub array. otherwise it returns 0.
if you are programming in Java or C#, the function signature is: int isSub(int[] a)*/