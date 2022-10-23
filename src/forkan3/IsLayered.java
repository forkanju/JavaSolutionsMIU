package forkan3;

public class IsLayered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 1, 2, 2, 2, 3};
		
		System.out.print("isLayered: ");
		System.out.println(isLayered(arr));
		System.out.println("Sorted: "+isSorted(arr));
	}
	
	public static int isLayered(int[] arr) {
		
		//first of all check wheather the given array is sorted or not
		//if not sorted arr then no need to further proccess return with 0
		//else go to further proccess and check the count of every element is twice or more or not.
		if(!isSorted(arr)) {
			return 0;
		}else {
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				count = 0;
				for (int j = 0; j < arr.length; j++) {
					if(arr[i] == arr[j]) {
						count++;
					}
				}
				if(count <= 1) return 0;
			}
		}
	
		return 1;
	}
	
	//seperate function for check wheather the given array is sorted or not
	public static boolean isSorted(int[] arr) {
		
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] > arr[i+1]) {
				return false;
			}
		}
		
		return true;
	}

}

/*5. An array is called layered if its elements are in ascending order and each element appears
two or more times. For example, {1, 1, 2, 2, 2, 3, 3} is layered but {1, 2, 2, 2, 3, 3} and {3, 3, 1, 1,
1, 2, 2} are not. Write a method named isLayered that accepts an integer array and returns 1 if
the array is layered, otherwise it returns 0.
If you are programming in Java or C#, the function signature is
int isLayered(int[ ] a)
If you are programming in C or C++, the function signature is
int isLayered(int a[ ], int len) where len is the number of elements in the array
Examples:
If the input array is return
{1, 1, 2, 2, 2, 3, 3} 1
{3, 3, 3, 3, 3, 3, 3} 1
{1, 2, 2, 2, 3, 3} 0 (because there is only one occurence of the value 1)
{2, 2, 2, 3, 3, 1, 1} 0 (because values are not in ascending order)
{2} 0
{} 0
Copy and paste your answer here and click the "Submit answer" button*/