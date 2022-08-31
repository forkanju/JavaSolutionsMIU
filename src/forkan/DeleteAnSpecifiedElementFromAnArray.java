package forkan;

public class DeleteAnSpecifiedElementFromAnArray {
	
	public static void main(String args[]) {
		int arr[] = {1, 5, 10, 20, 40, 80};
		int position = 3; //to be deleted
		int size = arr.length;
		
		for(int i = position - 1; i < size; i++) {
			arr[i] = arr[i+1];
			size--; 
		}
		
		
		for (int element: arr) {
            System.out.println(element);
        }
	}
	
	//Output: {1, 5, 20, 40, 80}

}
