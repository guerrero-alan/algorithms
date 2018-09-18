/*
 * 
 * A palindrome is a string or sequence of characters that reads the same backward as forward. 
 * For example, "madam" is a palindrome. Write a method that takes in a String and returns a boolean -> true 
 * if the input String is a palindrome and false if it is not. An empty string and a null input are considered palindromes. 
 * You also need to account for the space character. For example, "race car" should return 
 * false as read backward it is "rac ecar".
 * 
Runtime Complexity 
O(n)

Space Complexity 
O(1)
*/

public class PalindromeTester {
	public static boolean isStringPalindrome(String str){
	    if(str == null) return true;
	    
	    int start = 0;
	    int last = str.length() - 1;
	    
	    while(start < last) {
	        if(str.charAt(start) != str.charAt(last)) return false;
	        start += 1;
	        last -= 1;
	    }
	    return true;
	}
}
