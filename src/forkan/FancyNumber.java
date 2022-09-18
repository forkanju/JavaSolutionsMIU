package forkan;

public class FancyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isFancy(60));
	}
	
	static int isFancy(int number) {
		int isFancy = 0;
		int previous = 1;
		int prePrevious = 1;
		int currentNumber = 0;
		
		if(number == 1) isFancy = 1;
		if(number < 1) isFancy = 0;
		
		for(int i = 0; i < number/2; i++) {
			currentNumber = previous*3 + prePrevious*2;
			if(currentNumber == number) {
				isFancy = 1;
				break;
			}else {
				isFancy = 0;
				prePrevious = previous;  //1,1,5,17,61,..
				previous = currentNumber;
			}
		}
		
		return isFancy;
	}

}

/*Question 10
A fancy number is a number in the sequence 1,1,5,17,61,... Note the first two fancy numbers
are 1 and any fancy number other than the first two is sum of three times previous one and two times
the one before that. see below
1,
1,
3*1 + 2*1 = 5,
5*3 + 2*1 = 17,
17*3 + 5*2 = 61
Write a function named isFancy that returns 1, if it's integer argument is a Fancy number,
otherwise it returns 0.*/