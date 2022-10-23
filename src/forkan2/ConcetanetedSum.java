package forkan2;

public class ConcetanetedSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(checkConcatenatedSum(2,1));
	}
	
    static int checkConcatenatedSum(int num, int catlen) {
        int originNumber = num;
        int totalSum = 0;
        while (num != 0) {
            int digit = num % 10; //to concate same digit into last depending on catLen
            int concatSum = 0;
            for (int i = 0; i < catlen; i++) {
                concatSum = (concatSum * 10) + digit;
            }
            num = num / 10;
            totalSum += concatSum;
        }
        return originNumber == totalSum ? 1 : 0;
    }

}
