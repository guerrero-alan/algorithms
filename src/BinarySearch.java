//Runtime Complexity 
//O(log(n))

//Space Complexity 
//O(1)

public class BinarySearch {
	
	public static Boolean binarySearch(int[] arr, int n) {
	    int front = 0;
	    int last = arr.length-1;
	    
	    while(front <= last) {
	        int mid = (front + last) / 2;
	        if(n == arr[mid]) {
	            return true;
	        } else if (n < arr[mid]) {
	            last = mid - 1;
	        } else {
	            front = mid + 1;
	        }
	    }
	    return false;
	}
}
