package forkan2;

public class UpCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nUpCount(new int[] {2,3,1,-6,8,-3,-1,2}, 5));

	}
	
	static int nUpCount(int[] arr, int n) {
		int upcount = 0;
		int partialSumPrev = arr[0];
		int partialSumNext = 0;
		
		for(int i = 1; i < arr.length; i++) {
			partialSumNext = partialSumPrev + arr[i];
			if(partialSumPrev <= n && partialSumNext > n) {
				upcount++;
			}
			partialSumPrev = partialSumNext;
			
		}
		
		return upcount;
	}

}
