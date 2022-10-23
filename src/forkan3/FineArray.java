package forkan3;

public class FineArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 8, 15};
		
		System.out.println(isFine(arr));

	}
	
	public static int isFine(int[] arr) {
		
		int primeCount = 0;
		
		for(int i = 0; i < arr.length; i++) {
		
		if(isPrime(arr[i])==1) {
			primeCount++;
			
			for(int j = 0; j < arr.length-1; j++) {
				if(arr[i] - arr[i+1] == 2 || arr[i] - arr[i+1] == -2) {
					return 1;
				
				}
			}
	
		}
		if(primeCount == 0){
			return 1;
		}
	
		}
		
		if(primeCount < 2) return 0;
		
		System.out.println("PR: "+primeCount);
	
		return 0;
	}
	
	
	
	
	public static int isPrime(int x){
		for(int i=2;i<x;i++){
			if(x%i==0){
				return 0;
			}
		}
		return 1;
	}
	

}

/*2. A twin prime is a prime number that differs from another prime number by 2. A Fine array is
defined to be an array in which every prime in the array has its twin in the array. So {4, 7, 9, 6, 5}
is a Fine array because 7 and 5 occurs. Note that {4, 9, 6, 33} is a Fine array since there are no
primes. On the other hand, {3, 8, 15} is not a Fine array since 3 appear in the array but its twin 5
is not in the array.
Write a function named isFineArray that returns 1 if its array argument is a Fine array, otherwise
it returns 0.
If you are programming in Java or C#, the function signature is
int isFineArray (int [ ] a)
If you are programming in C or C++, the function signature is
int isFineArray (int a[ ], int len) where len is the number of elements in the array.
You may assume that there exists a function isPrime that returns 1 if it argument is a prime,
otherwise it returns 0. You do not have to write this function.*/