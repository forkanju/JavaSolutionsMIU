package forkan;

/*
 * Problem statement: Find common elements from three sorted Arrays.
 * 
 * INPUT: 
 * arr1[] = {1, 5, 10, 20, 40, 80};
 * arr2[] = {6, 7, 20, 80, 100};
 * arr3[] = {3, 4, 15, 20, 30, 70, 80, 120};
 * 
 * OUTPUT: 
 * {20, 80}
 *
 ** */

public class FindCommonElements {

	public static void main (String args[]) {
		
		 int arr1[] = {1, 5, 10, 20, 40, 80};
		 int arr2[] = {6, 7, 20, 80, 100};
		 int arr3[] = {3, 4, 15, 20, 30, 70, 80, 120};
		 
		 findCommonElements(arr1, arr2, arr3);
	}
	
	//Function to find common elements
	public static void findCommonElements(int arr1[], int arr2[], int arr3[]) {
		
		int x = 0;
		int y = 0;
		int z = 0;
		
		while(x < arr1.length && y < arr2.length && z < arr3.length) {
			if(arr1[x] == arr2[y] && arr2[y] == arr3[z]) {
				System.out.println("Common: "+ arr1[x]);
			
				x++;
				y++;
				z++;
			}else if (arr1[x] > arr2[y]) {
				y++;
			}else if (arr2[y] > arr3[z]) {
				z++;
			}else {
				x++;
			}
		}
		
	}
}
