package forkan2;

import java.util.ArrayList;
import java.util.List;

public class DaphneArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isDaphneArray(new int[] {2, 8, 7, 10, -4, 6}));
	}
	
	static int isDaphneArray(int[] arr) {
		
		List<Integer> startEven = new ArrayList<Integer>();
		List<Integer> endEven = new ArrayList<Integer>();
		boolean hasOdd = false;
		
		if(arr[0] % 2 != 0) return 0;
		if(arr[arr.length-1] % 2 != 0) return 0;
		
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0) {
				hasOdd = true;
			}

		}
		

		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				startEven.add(arr[i]);
			}else break;
		}
		
		for(int j = arr.length-1; j >= 0; j--) {
			if(arr[j] % 2 == 0) {
				endEven.add(arr[j]);
			}else break;
		}
		
		if(endEven.size() == startEven.size() && hasOdd == true) {
			return 1;
		}else {
			return 0;
		}
		

	}

}


/*
 * A Daphne array is defined to be an array that contains at least one odd number and  
 * begins and ends with the same number of even numbers.
 So {4, 8, 6, 3, 2, 9, 8,11, 8, 13, 12, 12, 6} is a Daphne array because 
 it begins with three even numbers and ends with three even numbers and 
 it contains at least one odd number
 The array {2, 4, 6, 8, 6} is not a Daphne array because 
 it does not contain an odd number.
 The array {2, 8, 7, 10, -4, 6} is not a Daphne array because 
 it begins with two even numbers but ends with three even numbers.
*/