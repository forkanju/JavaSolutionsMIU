package forkan2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeNumber {

	public static void main(String[] args) {
	
	System.out.println(Arrays.toString(encodeNum(1)));
	
	}
	
    public static int[] encodeNum(int num){
        if (num <= 1) return null;
        List<Integer> primeFactors = new ArrayList<>();

        for(int i = 2; i < num; i++){
            while(num % i == 0){
                primeFactors.add(i);
                num = num/i;
            }
        }
        if(num > 1) primeFactors.add(num);
        int [] returnArr = new int[primeFactors.size()];
        for (int i = 0; i < primeFactors.size(); i++){
            returnArr[i] = primeFactors.get(i);
        }
        return returnArr;
    }

}
