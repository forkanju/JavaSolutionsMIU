package forkan2;

public class BeanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isBeanArray(new int[] {3, 4, 5, 7}));

	}
	
	static int isBeanArray(int [] arr) {
		int isBean = 0;
		for(int i = 0; i < arr.length; i++) {
		    isBean = 0; //every time set 0
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] == (arr[j]+1) || arr[i] == (arr[j]-1)) {
					isBean++;
				}
			}
			if(isBean == 0) return 0;//when found 0 then return from loop with 0
		}
		return 1;
	}

}


/*
 * A Bean array is defined to be an array where for every value n in the array, there is also an element n-1 or n+1 in the array. 
	For example, {2, 10, 9, 3} is a Bean array because
	2 = 3-1
	10 = 9+1
	3 = 2 + 1
	9 = 10 -1
	
	Other Bean arrays include {2, 2, 3, 3, 3}, {1, 1, 1, 2, 1, 1} and {0, -1, 1}.
	
	The array {3, 4, 5, 7} is not a Bean array because of the value 7 which requires that the 
	array contains either the value 6 (7-1) or 8 (7+1) but neither of these values are in the array.
 */
