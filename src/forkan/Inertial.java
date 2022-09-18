package forkan;

public class Inertial {
	
	public static void main(String[] args) {

	System.out.println(isInertial(new int[]{1,1,1,1,1,1,2}));
	
	}
	
	public static int isInertial(int arr[]) {
		int isInertial = 1;
		int hasAtleastOneOdd = 0; //done
		int isMaxNumberEven = 0;  //done
		int maxnumber = arr[0];
		int lengthOdd = 0;
		int lengthEven = 0;
		
		// a. it contains at least one odd value [first condition]
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 1 || arr[i] % 2 == -1) {
				hasAtleastOneOdd = 1;
				lengthOdd++;
			}else lengthEven++;
		}
		
		if(hasAtleastOneOdd == 0) return 0; //[first condition done]
		
		
		//b. the maximum value in the array is even [second condition]
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j < i; j++) {
				if(arr[i] > arr[j]) {
					if(arr[i] > maxnumber) maxnumber = arr[i];
				}
			}
		}
		
		if(maxnumber % 2 == 0 || maxnumber % 2 == -0) {
			isMaxNumberEven = 1;
		}
		
		if(isMaxNumberEven == 0) return 0; //[second condition done]
		
		
		//c. every odd value is greater than every even value that is not the maximum value.
		int[] oddItems = new int[lengthOdd];
		int[] evenItems = new int[lengthEven];
		int oddIdx = 0;
		int evenIdx = 0;
		
		//storing value to the new decalred arrays
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0 || arr[i] % 2 == -0) {
				evenItems[evenIdx] = arr[i];
				evenIdx++;
				
			}else {
				oddItems[oddIdx] = arr[i];
				oddIdx++;
			}
		}
		
		for(int i = 0; i < oddItems.length; i++) {
			for(int j = 0; j < evenItems.length; j++) {
				if(evenItems[j] != maxnumber) {
					if(oddItems[i] < evenItems[j]) {
						isInertial = 0;
						return isInertial;
					}
				}
			}
		} ////[third condition done]
		
		return isInertial;
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