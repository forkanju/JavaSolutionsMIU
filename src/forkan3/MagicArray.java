package forkan3;

public class MagicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {21, 3, 7, 9, 11, 4, 6};
		System.out.println(isMagicArray(arr));
		
	}
	
	public static int isMagicArray(int[] arr) {
		int primesSum = 0;
		for(int i = 0; i < arr.length; i++) {
				if(isPrime(arr[i]) == 1) {
					if(arr[i]>0) {
						primesSum += arr[i];
					}
					
				}
				
		}
		System.out.println(primesSum);
		
		if(primesSum == arr[0]) {
			return 1;
		}
		return 0;
	}
	
	public static int isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return 0;
			}

		}
		return 1;
	}

}

/*2. An array is defined to be a Magic array if the sum of the primes in the array is equal to the
first element of the array. If there are no primes in the array, the first element must be 0. So {21,
3, 7, 9, 11 4, 6} is a Magic array because 3, 7, 11 are the primes in the array and they sum to 21
which is the first element of the array. {13, 4, 4, 4, 4} is also a Magic array because the sum of
the primes is 13 which is also the first element. Other Magic arrays are {10, 5, 5}, {0, 6, 8, 20}
and {3}. {8, 5, -5, 5, 3} is not a Magic array because the sum of the primes is 5+5+3 = 13. Note
that -5 is not a prime because prime numbers are positive.
Write a function named isMagicArray that returns 1 if its integer array argument is a Magic array.
Otherwise it returns 0.
If you are writing in Java or C#, the function signature is
int isMagicArray (int[ ] a)
If you are writing in C or C++, the function signature is
int isMagicArray (int a[ ], int len) where len is the number of elements in the array.
You may assume that a function named isPrime exists that returns 1 if its int argument is a
prime, otherwise it returns 0. You do not have to write this function! You are allowed to use it.*/