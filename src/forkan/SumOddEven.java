package forkan;

/**forkan/MIU
 * 28 August 2022 @pran-rfl-group*/

public class SumOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myArr[] = {1,2};
		
		System.out.println(sumOddEven(myArr));
		
	}
		
		private static int sumOddEven(int arr[]) {
			int evenSum = 0;
			int oddSum = 0;
			
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] % 2 == 0) {
					evenSum += arr[i];
				}else {
					oddSum += arr[i];
				}
			}
			
			return oddSum - evenSum;
		}
		
	
}
