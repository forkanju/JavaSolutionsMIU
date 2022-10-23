package forkan2;

public class Inertial {

	static int isInertial(int[] arr) {
		int isInertial = 1;
		int max = arr[0];
		int oddLength = 0;
		int evenLength = 0;
		
	
		if(arr.length < 2) return 0;
		
		//to check condition a
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0 || arr[i] % 2 != -0) {
				oddLength++;
			}else {
				evenLength++;
			}
		}
		
		//if even value occurs 1 time that means no other even to compare with odd value
		if(oddLength < 1) return 0;

		//find max value and check if it is even or odd
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		if(max % 2 != 0 || max % 2 != -0) isInertial = 0;
		
	
	//	System.out.println("sumEven = "+(anEven-max));
		System.out.println("max = "+max);
		


		int[] oddItems = new int[oddLength];
		int[] evenItems = new int[evenLength];
		int oddIndex = 0;
		int evenIndex = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0 || arr[i] % 2 == -0) {
				evenItems[evenIndex] = arr[i];
				evenIndex++;
			}else {
				oddItems[oddIndex] = arr[i];
				oddIndex++;
			}
		}
		
		
		for(int i = 0; i < evenItems.length; i++) {
			for(int j = 0; j < oddItems.length; j++) {
				if(evenItems[i] != max) {
					if(oddItems[j] < evenItems[i]) {
						isInertial = 0;
					}
					
				}
			}
		}
		
		return isInertial;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isInertial(new int[] {2}));

	}
	
}


/*Question 17
An array is defined to be inertial if the following conditions hold:
a. it contains at least one odd value
b. the maximum value in the array is even
c. every odd value is greater than every even value that is not the maximum value.
so {11,4,20,9,2,8} is inertial because
 - it contains at least one odd value
 - the maximum value in the array is 20 which is even
 - the two odd values (11 and 9) are greater than all the even values that are not
equal to 20 (the maximum), i.e {4,2,8}.
However, {12,11,4,9,2,3,10} is not inertial because it fails condition (c), i.e.
10 (which is even) is greater than 9 (which is odd), and 10 is not the maximum value
in the array.

Write a function called isInertial that accepts an integer array and returns 1 if the array
is inertial; otherwise it returns 0.
If you are programing in Java or C#, the function signature is
int isInertial(int[] a)

Some other examples:
 -----------------------|--------|-----------------------------------------------------------------------
| if the input array is | return | reason                                                                |
|-----------------------|--------|-----------------------------------------------------------------------|
| {1}                   | 0      | fails condition (a) - the maximum value must be even                  |
|-----------------------|--------|-----------------------------------------------------------------------|
| {2}                   | 0      | fails condition (b) - the array must contain at least one odd value   |
|-----------------------|--------|-----------------------------------------------------------------------|
| {1,2,3,4}             | 0      | fails condition (c) - 1(which is odd) is not greater than all even    |
|                       |        | values other than the maximum (1 is less than 2 which is not the max) |
|-----------------------|--------|-----------------------------------------------------------------------|
| {1,1,1,1,1,1,2}       | 1      | there is no even number other than the maximum. Hence, there can be no|
|                       |        | other even values that are greater than 1.                            |
|-----------------------|--------|-----------------------------------------------------------------------|
| {2,12,4,6,8,11}       | 1      | 11, the only odd value is greater than all even values except 12 which|
|                       |        | is the maximum value in the array.                                    |
|-----------------------|--------|-----------------------------------------------------------------------|
| {2,12,12,4,6,8,11}    | 1      | same as previous, ie, it is ok if maximum value occurs more than once |
|-----------------------|--------|-----------------------------------------------------------------------|
| {-2,-4,-6,-8,-11}     | 0      | -8, which is even, is not the maximum value but is greater than -11   |
|-----------------------|--------|-----------------------------------------------------------------------|
| {2,3,5,7}             | 0      | the maximum value is odd                                              |
|-----------------------|--------|-----------------------------------------------------------------------|
| {2,4,6,8,10}          | 0      | there is no odd value in the array                                    |
 -----------------------|--------|-----------------------------------------------------------------------*/