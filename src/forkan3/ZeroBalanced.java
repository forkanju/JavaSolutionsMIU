package forkan3;

public class ZeroBalanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,-1,-2,-2,4};
		System.out.println(isZeroBalanced(arr));
	}
	
	public static int isZeroBalanced(int[] arr) {
		int sum = 0;
		int countOpp = 0;
		
		if(arr.length == 0) return 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			
			countOpp = 0;
			for(int j = 0; j < arr.length; j++) {
				if(arr[i]+arr[j]==0) {
					countOpp++;
				}
			}
			if(countOpp == 0) {
				return 0;
			}
		}
		if(sum == 0) {
			return 1;
		}
		
		
		return 0;
	}

}

/*11. An array is called zero-balanced if its elements sum to 0 and for each positive element n,
there exists another element that is the negative of n. Write a function named isZeroBalanced
that returns 1 if its argument is a zero-balanced array. Otherwise it returns 0.
If you are writing in Java or C#, the function signature is
int isZeroBalanced(int[ ] a)
If you are writing in C or C++, the function signature is
int isZeroBalanced(int a[ ], int len) where len is the number of elements in a
Examples:
if a is return
{1, 2, -2, -1} 1 because elements sum to 0 and each positive element has a corresponding
negative element.
{-3, 1, 2, -2, -1, 3} 1 because elements sum to 0 and each positive element has a
corresponding negative element.
{3, 4, -2, -3, -2} 0 because even though this sums to 0, there is no element whose value is
-4
{0, 0, 0, 0, 0, 0} 1 this is true vacuously; 0 is not a positive number
{3, -3, -3} 0 because it doesn't sum to 0. (Be sure your function handles this array correctly)
{3} 0 because this doesn't sum to 0
{} 0 because it doesn't sum to 0
*/