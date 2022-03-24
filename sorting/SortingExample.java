package sorting;

public class SortingExample {

	public static void main(String[] args) {
		
		int[] list = {3,4,5,1,2,};
		int n = list.length;
		
		for (int i = 0; i < n-1; i++) { // #passes
			for (int j = 0; j < (n-1)-i; j++) { //# of comparisons
				if (list[j] > list [j+1]) { // comparison
					int temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
			}
		}
	    int n2 = list.length; 
	    for (int i = 0; i < n2 ; ++i) {
	    	System.out.println(list[i]); 
	        }
	}
}