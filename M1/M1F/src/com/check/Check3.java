package com.check;

import java.util.Arrays;

public class Check3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input = "chatgpt";

	        // Convert string to a character array
	        char[] chars = input.toCharArray();

	        // Sort the character array
	        Arrays.sort(chars);

	        // Convert back to string
	        String sortedString = new String(chars);

	        // Print the result
	        System.out.println("Lexicographically sorted string: " + sortedString);
	        String k = "11";
	        
	        if(k.matches("^(0[0-9]|[1-9][0-9])$")) {
	        	System.out.println("RAm Ram");
	        }

	}

}
