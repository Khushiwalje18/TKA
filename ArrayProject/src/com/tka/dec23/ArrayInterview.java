package com.tka.dec23;

public class ArrayInterview {
	int findLength(int[] a) {
		int size = a.length;
		return size;
	}

	int findMaximum(int[] a) {
		int maxNum = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > maxNum) {
				maxNum = a[i];
			}
		}
		return maxNum;
	}

	int findSecondMaximum(int[] a) {
		int maxNum = a[0];
		int secMax = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > maxNum) {
				secMax = maxNum;
				maxNum = a[i];
			} else if ( a[i] >secMax && a[i] < maxNum) {
				secMax = a[i];
			}
		}
		return secMax;
	}

	int findMinimum(int[] a) {
		int minNum = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < minNum) {
				minNum = a[i];
			}
		}
		return minNum;
	}

	int findSecondMinimum(int[] a) {
		int minNum = a[0];
		int secMin = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < minNum) {
				secMin = minNum;
				minNum = a[i];
			} else if ( a[i] <secMin && a[i] > minNum) {
				secMin = a[i];
			}
		}
		return secMin;
	}
}
