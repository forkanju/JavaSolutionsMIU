package forkan3;

import java.util.HashMap;
import java.util.HashSet;

public class HasNValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 2, 1};
		
		System.out.println(hasNValues(arr, 2));
		
		System.out.println(findUniqueByHashSet(arr));
		
	}
	
	private static int hasNValues(int[] arr, int n) {
		if(uniqueElementSize(arr) == n) {
			return 1;
		}
		return 0;
	}
	

	//using hashmap find the unique size of an array
	public static int uniqueElementSize(int[]arr) {
		
	    HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();   
	    for (int i = 0; i < arr.length; i++) {   
            hashmap.put(arr[i], i);   
        }   
	    
	    int uniqueSize = hashmap.size();
	    
		return uniqueSize;
	}
	
	//using hashset find the unique size of an array
	public static int findUniqueByHashSet(int[] arr) {
		HashSet<Integer> hashset = new HashSet<Integer>();
		for(int i = 0; i < arr.length; i++) {
			if(!hashset.contains(arr[i])) {
				hashset.add(arr[i]);
			}
		}
		
		return hashset.size();
	}

}

/*2 Write a function named hasNValues which takes an array and an integer n as arguments. It
returns true if all the elements of the array are one of n different values.
If you are writing in Java or C#, the function signature is
int hasNValues(int[ ] a, int n)
If you are writing in C or C++, the function signature is
int hasNValues(int a[ ], int n, int len) where len is the length of a
Note that an array argument is passed by reference so that any change you make to the array
in your function will be visible when the function returns. Therefore, you must not modify the
array in your function! In other words, your function should have no side effects.
Examples
if a is if n is return
{1, 2, 2, 1} 2 1 (because there are 2 different element values, 1 and 2)
{1, 1, 1, 8, 1, 1, 1, 3, 3} 3 1 (because there are 3 different element values, 1, 3, 8)
{1, 2, 3, 4, 5, 6, 7, 8 ,9, 10} 10 1 (because there are 10 different element values)
{1, 2, 2, 1} 3 0 (because there are 2 different element values, not 3 as required)
{1, 1, 1, 8, 1, 1, 1, 3, 3} 2 0 (because there are 3 different element values, not 2 as
required)
{1, 2, 3, 4, 5, 6, 7, 8 ,9, 10} 20 0 (because there are 10 different element values, not 20 as
required)
Hint: There are many ways to solve this problem. One way is to allocate an array of n integers
and add each unique element found in the array parameter to it. If you add n elements to the
array, return 1, otherwise return 0.
*/