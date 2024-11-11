package Package;

import java.util.Arrays;

public class SuperReduced {

	 public static String superReducedString(String s) {
		 StringBuilder result = new StringBuilder();

		    for (char c : s.toCharArray()) {
		        int length = result.length();
		        if (length > 0 && result.charAt(length - 1) == c) {
		            // Remove the last character if it's the same as the current character
		            result.deleteCharAt(length - 1);
		        } else {
		            // Add the current character to the result
		            result.append(c);
		        }
		    }

		    return result.length() == 0 ? "Empty String" : result.toString();
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="baccab";
		System.out.println(superReducedString(s));
	}

}
