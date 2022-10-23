package forkan2;

public class PrimeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(primeCount(10, 30));

	}
	
	static int primeCount(int start, int end) {
		int primeCount = 0;
		
		for(int i = start; i <= end; i++) {
			if(i > 1) {
				boolean isPrime = true;
				for(int j = 2; j*2 < i; j++) {
					if(i % j == 0) {
						isPrime = false;
					}
				}
				if(isPrime) {
					primeCount++;
				}
			}
		}
		return primeCount;
	}
	


}
