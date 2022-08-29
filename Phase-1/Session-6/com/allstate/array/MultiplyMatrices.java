package com.allstate.array;

public class MultiplyMatrices {
	public static void main(String[] args) {
		int fm[][]= {{3,-2,5},{3,0,4}};
		int sm[][]= {{2,3},{-9,0},{0,4}};
		int r1=2; int c1=3;
		int r2=3; int c2=2;
		
		int product[][]= multiply(fm, sm, r1, c1, r2, c2);
		
		for(int rows[]:product) {
			for(int col:rows)
				System.out.print(col+"\t");
			System.out.println();
		}
	}
	public static int[][] multiply(int firstMatrix[][],int secondMatrix[][],
			int r1,int c1,int r2, int c2){
		
		int result[][]= new int[r1][c2];
		
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c2;j++) {
				for(int k=0;k<c1;k++) {
					result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
				}
			}
		}
		return result;
	}
}
