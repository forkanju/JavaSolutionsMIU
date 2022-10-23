package forkan2;

public class LeargestPrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(largePrimeFactor(6936));
	}
	
    static int largePrimeFactor(int num){
    	int number = num;
    	if (number <= 1) return 0;
    	while(number > 1) {
    		if(num % number == 0) {
    			boolean isPrime = true;
    			for(int i = 2; i < number; i++) {
    				if(number % i == 0) {
    					isPrime = false;
    					break;
    				}
    			}
    			if(isPrime) return number;
    		}
    		number--;
    	}
        return 0;
    }
}
