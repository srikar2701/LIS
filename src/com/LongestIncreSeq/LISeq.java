package com.LongestIncreSeq;

public class LISeq {

	static int max_ref;

	static int lis(int arr[], int n) {

		if (n == 1)
			return 1;

		int res, Length_Lis = 1;

		for (int i = 1; i < n; i++) {
			res = lis(arr, i);
			if (arr[i - 1] < arr[n - 1] && res + 1 > Length_Lis)
				Length_Lis = res + 1;
		}

		if (max_ref < Length_Lis)
			max_ref = Length_Lis;

		return Length_Lis;
	}

	static int _lis(int arr[], int n) {
		max_ref = 1;
		lis(arr, n);

		return max_ref;
	}

	public static void main(String args[]) {
		int arr[] = { 11, 15, 22, 48, 555, 66, 88, 99 };
		int n = arr.length;
		System.out.println("Length of lis is " + _lis(arr, n) + "\n");
	}

}
