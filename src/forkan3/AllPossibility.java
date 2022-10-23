package forkan3;

public class AllPossibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1-> non empty array
		//2-> must include all numbers between 0 and a.length-1
		System.out.println(isAllPossibilities(new int[] {1, 2, 5, 3,0}));
	}
	
	static int isAllPossibilities(int[] arr) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			count = 0;
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] == j) {
					count++;
				}
				
			}
			if(count == 0) return 0;
		}
		return 1;
	}

}


/*
 * 4. A non-empty array a of length n is called an array of all possiblities if it contains all numbers
between 0 and a.length-1 inclusive. Write a method named isAllPossibilities that accepts an
integer array and returns 1 if the array is an array of all possiblities, otherwise it returns 0.
If you are programming in Java or C#, the function signature is
int isAllPossibilities(int[ ] a)
If you are programming in C or C++, the function signature is
int isAllPossibilities(int a[ ], int len) where len is the number of elements in the array
Examples
If the input array is return
{1, 2, 0, 3} 1
{3, 2, 1, 0} 1
{1, 2, 4, 3} 0 (because 0 not included and 4 is too big)
{0, 2, 3} 0 (because 1 is not included)
{0} 1
{} 0*/
 