package forkan2;

import java.util.Arrays;

public class ComputeHMS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(computeHms(35535)));

	}
	
	static int[] computeHms(int number) {
		int hour = 0;
		int minuite = 0;
		int second = 0;
		
		if(number > 3600) {
			hour = number  / 3600;
			number = number - hour*3600;
			if(number >= 60) {
				minuite = number/60;
				number = number - minuite*60;
				if(number < 60) {
					second = number;
				}
			}
		}else {
			minuite = number/60;
			number = number - minuite*60;
			if(number < 60) {
				second = number;
			}
		}
		int[] hms = new int[]{hour, minuite, second};
		
		return hms;
	}
	

}
/*
 * Write a method named computeHMS that computes the number of hours, minutes and seconds 
 * in a given number of seconds. 
 * Example: 3735 returns {1, 2, 15}	
 * because 3735 = 1*3600 + 2*60 + 15. 
 * In other words, 3,735 is the number of seconds in 1 hour 2 minutes and 15 seconds
 */