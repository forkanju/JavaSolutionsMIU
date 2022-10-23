package forkan;

public class PorcupineNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println(findPorcupineNumber(139));
		

	}
	
	 static int findPorcupineNumber(int number) {
	        int porcupineNumber = 0;
	        number++;

	        while (number <= number*2) {
	                if (isPrime(number) == 1) {
	                    if (number % 10 == 9) {
	                    	 porcupineNumber = number;
	                    	 break;
	                    }
	                    
	                }
	            
	            number++;
	        }
	        return porcupineNumber;
	    }

	    static int isPrime(int number) {
	        int isPrime = 0;
	        if (number > 1) {
<<<<<<< HEAD
	            for (int i = 2; i <= number/2; i++) { //There is no number that can be completely divided by more
	                if (number % i == 0) {			  // than half of the number itself. We need to loop through two 
	                    isPrime = 0;				  //to the number itself divided by two (number/2).
=======
	            for (int i = 2; i*2 <= number; i++) {
	                if (number % i == 0) {
	                    isPrime = 0;
>>>>>>> 8e0da204efeea7576464f6309d936f8cd1a51025
	                    break;
	                } 
	            }
	            isPrime = 1;
	        }
	        return isPrime;
	    }

}

/*Question 19
A prime number is an integer that is divisible only by 1 and itself. A porcupine number is a prime
number whose last digit is 9 and the next prime number that follows it also ends with the digit 9.
For example 139 is a porcupine number because:
a - it is prime
b - it ends in a 9
c - The next prime number after it is 149 which also ends in 9.
Note that 140, 141, 142, 143, 144, 145, 146, 147, and 148 are not prime so 149 is the next prime
number after 139.

Write a method named findPorcupineNumber which takes an integer argument n and returns the first
porcupine number that is greater than n. So findPorcupineNumber(0) would return 139 (because 139
happens to be the first porcupine number) and so would findPorcupineNumber(138).
But findPorcupineNumber(139) would return 409 which is the second porcupine number.

The function signature is
int findPorcupineNumber(int n)
You may assume that a porcupine number greater than n exists.
You may assume that a function isPrime exists that returns 1 if its argument is prime, otherwise
it returns 0. e.g isPrime(7) returns 1 and isPrime(8) returns 0.
Hint: Use modulo base 10 arithmetic to get last digit of a number.*/