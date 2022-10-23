package forkan3;

public class OddValent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 2, 2, 4, 4};
		System.out.println(isOddValent(arr));
	}
	
	
	public static int isOddValent(int[] arr) {
		if(hasDuplicate(arr)) {
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] %2 != 0) {
					return 1;
				}
			}
		}
		return 0;
	}
	
	//check if array contains duplicates or not
	public static boolean hasDuplicate(int[] arr) {
		boolean duplicates= false;
		for (int j=0;j<arr.length;j++) {
			 for (int k=j+1;k<arr.length;k++) {
				 if (k!=j && arr[k] == arr[j]) {
					  duplicates=true;
				 }
			 }
		}
		 
		 return duplicates;  
		    
	}

}

/*3. An array is defined to be odd-valent if it meets the following two conditions:
a. It contains a value that occurs more than once
b. It contains an odd number
For example {9, 3, 4, 9, 1} is odd-valent because 9 appears more than once and 3 is odd. Other
odd-valent arrays are {3, 3, 3, 3} and {8, 8, 8, 4, 4, 7, 2}
The following arrays are not odd-valent:
{1, 2, 3, 4, 5} - no value appears more than once.
{2, 2, 2, 4, 4} - there are duplicate values but there is no odd value.
Write a function name isOddValent that returns 1 if its array argument is odd-valent, otherwise it
returns 0.
If you are programming in Java or C#, the function prototype is
int isOddValent (int[ ] a);
If you are programming in C or C++, the function prototype is
int isOddValent (int a[ ], int len) where len is the number of elements in the array.
There are 3 questions on this test. You have 2 hours to finish it. Please do your own work.
*/