package com.check;

import java.util.Arrays;

public class Check2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n = 13;
		int count =0;
		for(int i =1;i<Math.sqrt(n);i++) {
			if(n%i==0) {
				count++;
				
			}
		}

	}

}
