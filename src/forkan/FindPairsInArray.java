package forkan;

/*Problem Statement=>
 * 
 *Find Pairs with given sum in a sorted Array
 *
 *Given an array A of size N.
 *We need to find all pairs in the array that sum to a number equal to K.
 *If no such pair exist then output will be -1.
 *
 *Array elements are distinct and in sorted order.
 *
 *For example -
 *
 *arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9}
 *sum = 9
 *
 *Sample output:
 *Pair(2, 7)
 *Pair(3, 6)
 *Pair(4, 5)
 **/
public class FindPairsInArray {
	
	public static void main(String[] args) {
		
		int arr[] =  {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int sum = 9;
		int low = 0;
		int high = arr.length - 1;
		
		while(low < high) {
			if(arr[low] + arr[high] < sum) {
				low++;
			}else if (arr[low] + arr[high] > sum) {
				high--;
			}else if ((arr[low] + arr[high]) == sum) {
				System.out.println("Pair (" + arr[low] +" , " + arr[high] + " )");
				low++;
				high--;
			}
		}
	}


}
