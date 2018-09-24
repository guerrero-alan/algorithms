/*
 * Given an Array containing 9 numbers ranging from 1 to 10, write a method to 
 * find the missing number. Assume you have 9 numbers between 1 to 10 and only one number is missing.
 * 
 * 
 * 
 * 
 * Runtime Complexity O(n)
 * 
 * Space Complexity O(1)
 * 
 * 
 * */

public class FindMissingNumber {
	public static int findMissingNumber(int[] arr) {
	    int sum = 0;
	    
	    for(int i = 1; i <= 10; i++) {
	        sum += i;
	    }
	    
	    int arrSum = 0;
	    
	    for(int i = 0; i < arr.length; i++) {
	        arrSum += arr[i];
	    }
	    
	    return sum - arrSum;
	}
}
