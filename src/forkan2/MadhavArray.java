package forkan2;

public class MadhavArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isMadhavArray(new int[] {3,1,2,3,0}));

	}
	
	static int isMadhavArray(int[] arr) {
		int isMadhav = 1;
		int isMadhavLength = 0;
		
		if(arr.length < 3) return 0;
		
		for(int i = 1; i < arr.length; i++) {
			if(arr.length == i*(i+1)/2) {
				isMadhavLength = 1;
			}
		}
		
		if(isMadhavLength == 0) return 0;
		
		int startIndex = 1;
		int round = 1;
		int endIndex = startIndex + round;
		int firstValue = arr[0];
		
		while(isMadhav == 1 && endIndex <= arr.length) {
			int sum = 0;
			for(int i = startIndex; i <= endIndex; i++) {
				sum += arr[i];
			}
			if(sum != firstValue) isMadhav = 0;
			
			round++;
			startIndex = endIndex + 1;
			endIndex = startIndex + round;
		}
		
		return isMadhav;
		
	}

}


/*Question 16
A Madhav array has the following property.
a[0] = a[1] + a[2] = a[3] + a[4] + a[5] = a[6] + a[7] + a[8] + a[9] = ...
The length of a Madhav array must be n*(n+1)/2 for some n.
Write a method named isMadhavArray that returns 1 if its array argument is a Madhav array,
otherwise it returns 0. If you are programming in Java or C# the function signature is
int isMadhavArray(int[] a)

Examples
 -----------------------------------|-------|---------------------------------------------------
| if a is                           | return| reason                                            |
|-----------------------------------|-------|---------------------------------------------------|
| {2,1,1}                           | 1     | 2 = 1 + 1                                         |
|-----------------------------------|-------|---------------------------------------------------|
| {2,1,1,4,-1,-1}                   | 1     | 2 = 1 + 1, 2 = 4 + -1 + -1                        |
|-----------------------------------|-------|---------------------------------------------------|
| {6,2,4,2,2,2,1,5,0,0}             | 1     | 6 = 2 + 4, 6 = 2 + 2 + 2, 6 = 1 + 5 + 0 + 0       |
|-----------------------------------|-------|---------------------------------------------------|
| {18,9,10,6,6,6}                   | 0     | 18 != 9 + 10                                      |
|-----------------------------------|-------|---------------------------------------------------|
| {-6,-3,-3,8,-5,-4}                | 0     | -6 != 8 + -5 + -4                                 |
|-----------------------------------|-------|---------------------------------------------------|
| {0,0,0,0,0,0,0,0,0,0,1,1,1,-2,-1} | 1     | 0 = 0+0, 0 = 0+0+0, 0 = 0+0+0+0, 0 = 1+1+1+-2+-1  |
|-----------------------------------|-------|---------------------------------------------------|
| {3,1,2,3,0}                       | 0     | The length of the array is 5, but 5 != n*(n+1)/2  |
 -----------------------------------|-------|---------------------------------------------------*/