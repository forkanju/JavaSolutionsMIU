package forkan3;

public class Fancy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isFancy(61));

	}
	
	public static int isFancy(int num) {
		int sum = 0;
		int firstSum = 1;
		int secondSum = 1;
		
		for(int i = 1; i < num; i++) {
			sum = firstSum*3+secondSum*2;
			if(sum == num) {
				return 1;
			}
			if(sum > num) break;
			secondSum = firstSum;
			firstSum = sum;
		}
		
		return 0;
	}
	
}

/*1. A fancy number is a number in the sequence 1, 1, 5, 17, 61, … .Note that first two fancy
numbers are 1 and any fancy number other than the first two is sum of the three times previous
one and two times the one before that. See below:
1,
1,
3*1 +2*1 = 5
3*5 +2*1 = 17
3*17 + 2*5 = 61
Write a function named isFancy that returns 1 if its integer argument is a Fancy number,
otherwise it returns 0.
The signature of the function is
int isFancy(int n)
 * */
 