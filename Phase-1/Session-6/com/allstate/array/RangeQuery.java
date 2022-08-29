package com.allstate.array;

public class RangeQuery {

	static int k = 16;
	static int N = 100000;

	static long st[][] = new long[N][k + 1];

	public static void sparsetable(int arr[]) {

		for (int i = 0; i < arr.length; i++)
			st[i][0] = arr[i];

		for (int j = 1; j <= k; j++)
			for (int i = 0; i + (1 << j) <= arr.length; i++)
				st[i][j] = st[i][j - 1] + st[i + (1 << (j - 1))][j - 1];
	}

	static long query(int L, int R) {
		long answer = 0;
		for (int j = k; j >= 0; j--) {
			if ((1 << j) <= R - L + 1) {
				answer += st[L][j];
				L += 1 << j;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		
		int array[]= {1,2,3,4,5,6,7,8,9};
		sparsetable(array);
		System.out.println(query(3, 5));
		System.out.println(query(0, 5));
	}
}
