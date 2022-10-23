package forkan2;

public class MeeraNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isMeera(21));
	}
	
	public static int isMeera(int n){
		int factorCount=0;
		for(int i=2;i<n;i++){
			if(n%i==0){
				factorCount++;
			}
		}
		if(n%factorCount==0){
			return 1;
		}
		return 0;
	}

//    static int isMeera(int num){
//        int meeraCount = 0;
//        for(int i = 2; i*2 < num; i++){
//            if(num % i == 0){
//                meeraCount++;
//            }
//            if(num % meeraCount == 0){
//                return 1;
//            }
//        }
//        return 0;
//    }

}



/*
 *A Meera number is a number such that the number of nontrivial factors is a factor of the number. 
 *For example, 6 is a Meera number because 6 has two nontrivial factors : 2 and 3. 
 *(A nontrivial factor is a factor other than 1 and the number). 
 *Thus 6 has two nontrivial factors. Now, 2 is a factor of 6. 
 *Thus the number of nontrivial factors is a factor of 6. 
 *Hence 6 is a Meera number. 
 *Another Meera number is 30 because 30 has 2, 3, 5, 6, 10, 15 as nontrivial factors. 
 *Thus 30 has 6 nontrivial factors. Note that 6 is a factor of 30. 
 *So 30 is a Meera Number.However 21 is not a Meera number. 
 *The nontrivial factors of 21 are 3 and 7. 
 *Thus the number of nontrivial factors is 2. 
 *Note that 2 is not a factor of 21. Therefore, 21 is not a Meera number. 
 */