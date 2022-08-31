package forkan;

import java.util.Arrays;

/**forkan/ MIU
 * 28 August 2022 @pran-rfl-group*/

public class CharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] myArray =  {'a', 'b', 'c', 'd', 'e'};
		
		;
		System.out.println(myChars(myArray, 2, 4));
		
	}
	
	private static String myChars (char[] charArr, int start, int len) {
	
		if(len <= 0 || start < 0 || start + len  > charArr.length)
			return null;
		
		char[] newChars = new char[len];
		for(int i = start, j = 0; j < len; i++, j++) {
			newChars[j] = charArr[i];
		}
	
		return Arrays.toString(newChars);
	}

}

