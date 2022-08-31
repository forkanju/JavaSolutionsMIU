package forkan;

/**Problem statement: Segregate 0s and 1s from an Array.
 * Input Array: [0, 1, 0, 1, 1, 0, 0, 1, 0]
 * Output Array: [0, 0, 0, 0, 0, 1, 1, 1, 1]*/

public class Segregate {
	
	 public static void main(String[] args) {
		 
		 int arr[] = {0, 1, 0, 0, 0, 1, 0, 1, 1, 0};
		 int j = 0;
		 
		 //Traverse an array
		 for(int i = 0; i < arr.length; i++) {
			 if(arr[i] == 0) {
				 arr[j] = arr[i]; //[0,0,0,0,0,0] 
				 j++;
				
			 }
		 }
		 
		 //We have already moved 0, now remaining value is 1 length = 10 //j = 6
		 while (j < arr.length) { //j = 6, arr.length = 10
			 arr[j] = 1; //here j = 6,7,8,9 [0,0,0,0,0,0,1,1,1,1]
			 j++;
		 }
		 
		 for(int k = 0; k < arr.length; k++) {
			 System.out.println(arr[k] + " ");
		 }
	       
	    }

}
