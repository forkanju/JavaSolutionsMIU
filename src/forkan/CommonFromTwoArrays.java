package forkan;

import java.util.Arrays;

/**forkan / MIU
 * 31 August 2022 @pran-rfl-group*/

public class CommonFromTwoArrays {

	public static void main(String[] args) {
		
		  System.out.println(findCommon(new int[]{3,9,7}, new int[]{9,4}));
	}
	
	//From Solution

	private static String findCommon(int[] first, int[] second) {
		
		if(first == null || second == null) return null;
		if(first.length == 0 || second.length == 0) return null;
		//two clone required because to fixed the small array
		int[] firstClone, secondClone;
		
		int minLength = first.length < second.length ? first.length : second.length;
		//by this condition here we fixed the first array is small
		if(first.length == minLength) {
			firstClone = first;
			secondClone = second;
		}else {
			firstClone = second;
			secondClone = first;
		}
		//count to track the common array elements size
		int count = 0;
		int[] returnArray = new int[minLength];
		//outer array is small otherwise will through an exception in some cases
		for(int i = 0; i < firstClone.length; i++) {
			for(int j = 0; j < secondClone.length; j++) {
				if(firstClone[i] == secondClone[j]) {
					returnArray[count] = firstClone[i];
					count++;
				}
			}
		}
		//This array need to get exact array length that values are common or similar.
		int[] commonElements = new int[count];
		for(int i = 0; i < commonElements.length; i++) {
			commonElements[i] = returnArray[i];
		}
		
		return Arrays.toString(commonElements);
	}
	
}


/*Question 5
Write a function to return an array containing all elements common to two
given arrays containing distinct positive integers. You should not use any inbuilt
methods. You are allowed to use any number of arrays.

The signature of the function is:
int[] f(int[] first, int[] second)

Examples:
 --------------------------------|--------------------------------------------------------------
| if the input parameters are    | return                                                       |
|--------------------------------|--------------------------------------------------------------|
| {1,8,3,2},{4,2,6,1}            | {1,2}                                                        |
|--------------------------------|--------------------------------------------------------------|
| {1,8,3,2,6},{2,6,1}            | {2,6,1}                                                      |
|--------------------------------|--------------------------------------------------------------|
| {1,3,7,9},{7,1,9,3}            | {1,3,7,9}                                                    |
|--------------------------------|--------------------------------------------------------------|
| {1,2}, {3,4}                   | {}                                                           |
|--------------------------------|--------------------------------------------------------------|
| {}, {1,2,3}                    | {}                                                           |
|--------------------------------|--------------------------------------------------------------|
| {1,2}, {}                      | {}                                                           |
|--------------------------------|--------------------------------------------------------------|
| {1,2}, null                    | null                                                         |
|--------------------------------|--------------------------------------------------------------|
| null, {}                       | null                                                         |
|--------------------------------|--------------------------------------------------------------|
| null, null                     | null                                                         |
 --------------------------------|--------------------------------------------------------------

NOTE: To ease debugging, Will return a string array.
		*/

