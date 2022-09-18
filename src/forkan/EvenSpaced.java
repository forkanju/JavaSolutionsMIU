package forkan;

public class EvenSpaced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(evenSpaced(new int[] {200,10,151,160}));

	}
	
	static int evenSpaced(int[] arr) {
		
	    int isEvenSpaced = 0;
        if (arr.length < 2) return 0;
        
		int largest = arr[0];
		int smallest = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					if(arr[i] > largest) largest = arr[i];
				}
				
				if(arr[i] < arr[j]) {
					if(arr[i] < smallest) smallest = arr[i];
				}
			}
		}
		

		System.out.println("Smallest: "+smallest);
		System.out.println("Largest: "+largest);
		System.out.println("Difference: "+(largest-smallest));
		
		System.out.println("---------- --- -----------");
		
		
		  
		if((largest-smallest) % 2 == 0) isEvenSpaced = 1;

		return isEvenSpaced;

	}

}


/*Question 23
An integer array is said to be evenSpaced, if the difference between the largest value
and the smallest value is an even number.

Write a function isEvenSpaced(int[] a) that will return 1 if it is evenSpaced and 0 otherwise.
if array has less than two elements, function will return 0.
 --------------------|--------------|----------------|----------------|----------------------------
| Array              | Largest value| Smallest value | Difference     | Return value               |
|--------------------|--------------|----------------|----------------|----------------------------|
| {100,19,131,140}   | 140          | 19             | 140 - 19 = 121 | 0                          |
|--------------------|--------------|----------------|----------------|----------------------------|
| {200,1,151,160}    | 200          | 1              | 200 - 1 = 199  | 0                          |
|--------------------|--------------|----------------|----------------|----------------------------|
| {200,10,151,160}   | 200          | 10             | 200 - 10 = 190 | 1                          |
|--------------------|--------------|----------------|----------------|----------------------------|
| {100,19,-131,-140} | 100          | -140           | 100-(-140)= 240| 1                          |
|--------------------|--------------|----------------|----------------|----------------------------|
| {80,-56,11,-81}    | 80           | -81            | 80 -(-81) = 161| 0                          |
 --------------------|--------------|----------------|----------------|----------------------------*/