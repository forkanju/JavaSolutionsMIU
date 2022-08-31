package forkan;

import java.util.HashSet;
import java.util.Set;

public class DuplicateValueInArray {
	
	 public static void main(String[] args) {
	       int arr[] = {1,5,4,2,1,4,7,8,7}; 
	       
	       Set<Integer> uniqueNumber = new HashSet<>();
	       Set<Integer> duplicateNumbers = new HashSet<>();
	       
	       boolean isDuplicateExist = false;
	       
	       for(int i = 0; i < arr.length; i++) {
	    	   if(uniqueNumber.contains(arr[i])) { //1,5,4,2,1,4,7,8,7
	    		   isDuplicateExist = true;
	    		   duplicateNumbers.add(arr[i]);
	    		   System.out.println("Duplicate value is: "+ arr[i]);	
	    	   }else {
	    		   uniqueNumber.add(arr[i]); //1,5,4,2,7,8
	    	   }
	       }
	       if(!isDuplicateExist) {
	    	  // System.out.println(uniqueNumber);
	       }
	       System.out.println(uniqueNumber);
	       System.out.println(duplicateNumbers);
	       
	       //Another way to solve
	


	    }
	 
	 


}
