package forkan3;

public class FactorEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isEqualFactor(6, 9));

	}
	
	public static int isEqualFactor(int n, int m) {
		int countM = 0;
		int countN = 0;
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				countN++;
			}
		}
		
		for(int i = 1; i <= m; i++) {
			if(m % i == 0) {
				countM++;
			}
		}
		
		if(countN != countM) return 0;
		else return 1;
		
	}

}

/*Two integers are defined to be factor equal, if they have the same number of factors. For
example, integers 10 and 33 are factor equal because, 10 has four factors: 1, 2, 5, 10 and 33
also has four factors: 1, 3, 11, 33. On the other hand, 9 and 10 are not factor equal since 9 has
only three factors: 1, 3, 9 and 10 has four factors: 1, 2, 5, 10.
Write a function named factorEqual(int n, int m) that returns 1 if n and m are factor equal and 0
otherwise.
The signature of the function is
int factorEqual(int n, int m)
*/

/*In mathematics, a divisor of an integer n, also called a factor of n, 
 * 20 / 4 = 5 [here 4 is Factor or Divisor]*/
