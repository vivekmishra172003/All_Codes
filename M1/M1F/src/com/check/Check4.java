package com.check;

import java.util.Arrays;

public class Check4 {
	
	public static void main(String[] args) {
		System.out.println("Check it");
		String s = "I LOve zyx";
		String[] sa =  s.split(" ");
		for(int i =0;i<sa.length;i++) {
			char[] ch = sa[i].toCharArray();
			Arrays.sort(ch);
			System.out.println(new String(ch));
			
		}
	}

}
