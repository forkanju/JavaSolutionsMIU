package forkan3;

public class Fill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,5, 9, 12,-2,-1};
		int k = 3;
		int n = 10;
		int[] m= fill(a, k, n);
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i]);
		}
	}
	
	
	public static int[] fill(int[] arr, int k, int n) {
		int indexCount = 0;
		int[] arr2 = new int[n];
	
		
		while(n > k) {
			
			for(int i = 0; i < k; i++) {
				arr2[indexCount] = arr[i];
				indexCount++;
			}
			n = n - k;
			
		}
		System.out.println("IndexCount: "+indexCount);
		
		for(int i=0;i<k;i++){
			arr2[indexCount]=arr[i];
			
		}
		
		

		return arr2;
	}
	

	

	

}

/*Question 1. Write a function fill with signature
int[] fill(int[] arr, int k, int n)
which does the following: It returns an integer array arr2 of length n whose first k elements are
the same as the first k elements of arr, and whose remaining elements consist of repeating
blocks of the first k elements. You can assume array arr has at least k elements. The function
should return null if either k or n is not positive.
Examples: fill({1,2,3,5, 9, 12,-2,-1}, 3, 10) returns {1,2,3,1,2,3,1,2,3,1}. Fill({4, 2, -3, 12}, 1, 5)
returns {4, 4, 4, 4, 4}. fill({2, 6, 9, 0, -3}, 0, 4) returns null.
*/