package forkan3;

public class CubePerfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(27.0);

	}
	
	 static int isCubePerfect(int[] arr){
		 int minValue = -100;
		 int maxValue = 100;
		 int cubeCount = 0;
		 
		 for(int i = 0; i < arr.length; i++) {
			 for(int j = minValue; j < maxValue; j++) {
				 cubeCount = 0;
				 if(arr[i] == j*j*j) {
					 cubeCount++;
					 break; //break means out from the inner loop and go to next line(25)
				 }
			 }
			 if(cubeCount == 0) {
				 return 0;
			 }
		 }
		 

	        return 1;
	    }

}

/*3. An array is called cube-perfect if all its elements are cubes of some integer. For example, {-1,
1, -8, -27, 8} is cube-perfect because
-1 = -1 * -1 * -1
1 = 1 * 1 * 1
-8 = -2 * -2 * -2
-27 = -3 * -3 * -3
8 = 2 * 2 * 2
But {27, 3} is not cube-perfect because 3 is not the cube of any integer.
Write a function named isCubePerfect that returns 1 if its argument is cube-perfect, otherwise it
returns 0.
If you are programming in Java or C#, the function signature is
int isCubePerfect(int[ ] a)
If you are programming in C or C++, the function signature is
int isCubePerfect(int a[ ], int len) where len is the number of elements in a.
Examples
if a is return because
{1, 1, 1, 1} 1 all elements are cubes of 1
{64} 1 64 = 4*4*4
{63} 0 63 is not the cube of any integer
{-1, 0, 1} 1 -1 = -1 * -1 * -1, 0 = 0 * 0 * 0, 1=1 * 1 * 1
{} 1 no elements fail the cube test
{3, 7, 21, 36} 0 3 is not the cube of any integer*/