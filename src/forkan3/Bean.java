package forkan3;

public class Bean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4, 7, 16};
		int i = isBean(a);
		System.out.println(i);
		
	}
	
	static int isBean(int[] arr) {
		boolean has9 = false;
		boolean has13 = false;
		boolean has7 = false;
		boolean has16 = false;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == 9) {
				has9 = true;
			}else if(arr[i] == 13) {
				has13 = true;
			}else if(arr[i] == 7) {
				has7 = true;
			}else if(arr[i] == 16) {
				has16 = true;
			}
			
		}
		if(has9 == true && has13 == false || has7 == true && has16 == true) {
			return 0;
		}
		return 1;
	}
	


}

/*
 * 3. An array is defined to be a Bean array if it meets the following conditions
a. If it contains a 9 then it also contains a 13.
b. If it contains a 7 then it does not contain a 16.
So {1, 2, 3, 9, 6, 13} and {3, 4, 6, 7, 13, 15}, {1, 2, 3, 4, 10, 11, 12} and {3, 6, 9, 5, 7, 13, 6, 17}
are Bean arrays. The following arrays are not Bean arrays:
a. { 9, 6, 18} (contains a 9 but no 13)
b. {4, 7, 16} (contains both a 7 and a 16)
Write a function named isBean that returns 1 if its array argument is a Bean array, otherwise it
returns 0.
If you are programming in Java or C#, the function signature is
int isBean (int[ ] a)
If you are programming in C or C++, the function signature is
int isBean (int a[ ], int len) where len is the number of elements in the array.*/
