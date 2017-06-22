package com.paul;

public class MyArrayUtils {

	public static int findHighest(int[] array) {
		int temp = Integer.MIN_VALUE;
		
		for(int i = 0; i < array.length; ++i){
			if(temp < array[i]) temp = array[i];
		}
		
		return temp;
	}

}
