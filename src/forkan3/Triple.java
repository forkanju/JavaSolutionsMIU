package forkan3;

public class Triple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 1, 1, 1,3,3};
		System.out.println(isTriple(arr));
	}
	
	public static int isTriple(int[] arr) {

		for(int i = 0; i < arr.length; i++) {
			int count = 0;
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(count != 3) {
				return 0;
			}
			
		}
		
		return 1;
	}

}

/*3. Define a Triple array to be an array where every value occurs exactly three times.
For example, {3, 1, 2, 1, 3, 1, 3, 2, 2} is a Triple array.
The following arrays are not Triple arrays
{2, 5, 2, 5, 5, 2, 5} (5 occurs four times instead of three times)
{3, 1, 1, 1} (3 occurs once instead of three times)
Write a function named isTriple that returns 1 if its array argument is a Triple array. Otherwise it
returns 0.
If you are programming in Java or C#, the function signature is
int isTriple (int[ ] a)
If you are programming in C or C++, the function signature is
int isTriple (int a[ ], int len) where len is the number of elements in the array.
*/