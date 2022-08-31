package forkan;

import java.util.Arrays;

public class InsertionSort {
	
	void insertionSort(int array[]) {
	    int size = array.length;

	    for (int step = 1; step < size; step++) {
	    	
	   
	      int key = array[step];
	      int j = step - 1;

	      // Compare key with each element on the left of it until an element smaller than
	      // it is found.
	      // For descending order, change key<array[j] to key>array[j].
	      while (j >= 0 && key < array[j]) {
	        array[j + 1] = array[j];
	        --j;
	      }

	      // Place key at after the element just smaller than it.
	      array[j + 1] = key;
	    }
	    }
	    
	    void descOrder(int array[]){
	        int size = array.length;
	        for(int idx = 1; idx < size; idx++){
	            int temp = array[idx];
	            int j = idx - 1;

	            while (j >= 0 && temp > array[j]){
	                array[j+1] = array[j];
	                j--;
	            }
	            array[j+1 ] = temp;
	        }
	    }
	  

	  // Driver code
	  public static void main(String args[]) {
	    int[] data = { 9, 5, 1, 4, 3 };
	    InsertionSort is = new InsertionSort();
	    is.descOrder(data);
	    System.out.println("Sorted Array in Ascending Order: ");
	    System.out.println(Arrays.toString(data));
	  }

}
