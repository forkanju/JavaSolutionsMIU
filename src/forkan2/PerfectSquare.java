package forkan2;

public class PerfectSquare {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   System.out.println(nextPerfectSquare(-5));
	}
	
	static int nextPerfectSquare(int n) {
		int perfectSquare = 0;
		
		if(n > 0) {
			for(int i = 1; i < n; i++) {
				if(i*i > n) {
					perfectSquare = i * i;
					break;
				}
			}
			
		}else if(n == 0) {
			perfectSquare = 1;
		}else perfectSquare = 0;

		return perfectSquare;
	}
	
	
	//another method
	
	static int nextPerfectSquare2(int n) {
		 int nextPerfectSquare = 0;
		 if (n >= 0) {
	           double sqrtResult = Math.sqrt(n);
	           int baseNumber = (int) sqrtResult;
	           int nextNumber = baseNumber + 1;
	           nextPerfectSquare = (int) Math.pow(nextNumber, 2);
	           }
		 
		 return nextPerfectSquare;

	}
	  
}
