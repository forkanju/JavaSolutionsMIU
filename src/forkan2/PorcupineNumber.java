package forkan2;

public class PorcupineNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPorcupine(149));

	}
	
	static int isPorcupine(int number) {
        int porcupineNumber = 0;
        number++;//to avoid checking given number

        while (number <= number*2) {
                if (isPrime(number)) {
                    if (number % 10 == 9) {
                    	 porcupineNumber = number;
                    	 break;
                    }
                    
                }
            
            number++;
        }
        return porcupineNumber;
	}
	
	static boolean isPrime(int num) {
		boolean isPrime = true;
		if(num > 1) {
			for(int i = 2; i <= num/2; i++) {
				if(num % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		return isPrime;
	}

}
