package com.allstate.array;

public class RotateArray {

	public static void  rotate(int num[], int k) {
		
		if (k > num.length)
			k = k % num.length;
		
		//store the rotated array let's create new Array
		
		int result[]= new int[num.length];
		for(int i=0;i<k;i++) {
			result[i]=num[num.length-k+i];
		}
		int j=0;
		for(int i=k;i<num.length;i++) {
			result[i]=num[j];
			j++;
		}
		//copy resultant array in original array num
		System.arraycopy(result, 0, num, 0, num.length);
	}
	
	public static void main(String[] args) {
		int myArray[]= {1,2,3,4,5,6,7};
		RotateArray.rotate(myArray, 11);
		for(int x:myArray)
			System.out.print(x+" , ");
	}
}
