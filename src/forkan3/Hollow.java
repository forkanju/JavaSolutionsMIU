package forkan3;

public class Hollow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,0,0,0,3,4,5};
		System.out.println(isHollow(arr));

	}
	
	
	public static int isHollow(int[] arr) {
		int pre0count=0;
		int post0count=0;
		int zerocount=0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				if(zerocount==0){
					pre0count++;
				}
				else{
					post0count++;}
			}
			else if(arr[i]==0){
				if(post0count==0){
					zerocount++;
				}
				else{
					return 0;
				}
			}
		}
		if(zerocount<3 || post0count != pre0count || post0count == 0 && pre0count == 0){
			return 0;
		}
		return 1;
	}

}
/*3. An array is said to be hollow if it contains 3 or more zeroes in the middle that are preceded
and followed by the same number of non-zero elements. Write a function named isHollow that
accepts an integer array and returns 1 if it is a hollow array, otherwise it returns 0
Examples: isHollow({1,2,4,0,0,0,3,4,5}) returns 1. isHollow ({1,2,0,0,0,3,4,5}) returns 0.
isHollow ({1,2,4,9, 0,0,0,3,4, 5}) returns 0. isHollow ({1,2, 0,0, 3,4}) returns 0.
If you are programming in Java or C#, the function signature is
int isHollow(int[ ] a).
If you are C or C++ programmer
int isHollow(int[ ] a, int len)
where len is the number of elements in the array*/