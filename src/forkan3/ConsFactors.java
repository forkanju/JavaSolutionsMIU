package forkan3;

public class ConsFactors {

	public static void main(String[] args) {
		
		int n = -12;
		
		int i=isCons(n);
		System.out.println(i);

	}
	public static int isCons(int n){
	int	currentnum=0;
	int previousnum=0;
		
		for(int i=2;i<=n; i++){
			if(n%i==0){
			
				currentnum=i;
				if(currentnum-previousnum==1){
					return 1;
				}
				previousnum=i;
			}
			
		}
	return 0;
	}

}

/*8. A positive number n is consecutive-factored if and only if it has factors, i and j where i > 1, j >
1 and j = i + 1. Write a function named isConsecutiveFactored that returns 1 if its argument is
consecutive-factored, otherwise it returns 0.
the function signature is
int isConsectiveFactored(int n)
Examples:
If n is return because
24 1 24 = 2*3*4 and 3 = 2 + 1
105 0 105 = 3*5*7 and 5 != 3+1 and 7 != 5+1
90 1 factors of 90 include 2 and 3 and 3 = 2 + 1
23 0 has only 1 factor that is not equal to 1
15 0 15 = 3*5 and 5 != 3 + 1
2 0 2 = 1*2, 2 = 1 + 1 but factor 1 is not greater than 1
0 0 n has to be positive
-12 0 n has to be positive*/