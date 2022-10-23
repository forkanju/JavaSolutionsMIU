package forkan2;

public class LargestAdjecentSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(leargestAdjecentSum(new int[] {1,1,1,1,2,1,1}));

	}
	
	static int leargestAdjecentSum(int[] arr) {
		int result = arr[0]+arr[1];
		int newSum = 0;
	
		for(int i = 2; i < arr.length-1; i++) {
			newSum = arr[i]+arr[i+1];
			if(newSum > result) {
				result = newSum;
			}
		
		}
		return result;
		
	}

}
