package forkan;

public class SymmetricArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   System.out.println(isSym(new int[]{2,7,9,10,11,5,8}));
	}
	
	
    static int isSym(int[] a) {
        int isSymArray = 1;
        int[] firstHalfSym = new int[a.length/2];
        int[] secondHalfSym = new int[a.length/2];

        for (int i = 0; i < a.length/2; i++) {
            firstHalfSym[i] = a[i];
        }

        int count = a.length/2 - 1;
        if (a.length % 2 == 0) {
            for (int j = a.length - 1; j >= a.length/2; j--) {
                secondHalfSym[count] = a[j];
                count--;
            }
        } else {
            for (int j = a.length - 1; j >= a.length/2 + 1; j--) {
                secondHalfSym[count] = a[j];
                count--;
            }
        }

        // now compare arrays
        for (int i = 0, j=a.length/2 - 1; i < firstHalfSym.length; i++, j--) {
            if (firstHalfSym[i] % 2 == 0) {
                if (secondHalfSym[j] % 2 != 0) {
                    isSymArray = 0;
                    return isSymArray;
                }
            }
            if (firstHalfSym[i] % 2 == 1) {
                if (secondHalfSym[j] % 2 != 1) {
                    isSymArray = 0;
                    return isSymArray;
                }
            }
        }

        return isSymArray;
    }
	

}

/*Question 25
An isSym (even/odd Symmetric) array is defined to be an array in which even numbers
and odd numbers appear in the same order from "both directions".
You can assume array has at least one element.
{2,7,9,10,11,5,8} is a isSym array.
Note that from left to right or right to left we have even,odd,odd,even,odd,odd,even.

{9,8,7,13,14,17} is a isSym array.
Note from left to right or right to left we have {odd,even,odd,odd,even,odd}

However, {2,7,8,9,11,13,10} is NOT a isSym array.
From left to right we have {even,odd,even,odd,odd,odd,even}
From right to left we have {even,odd,odd,odd,even,odd,even} which is not the same.

Write a function named isSym that returns 1 if its array argument is a isSym array,
otherwise it returns 0.

if you are programming in Java or C#, the function signature is:
int isSym(int[] a)

if you are programming in C or C++, the function is:
int isSym(int a[], int len) where len is the number of elements in the array.*/