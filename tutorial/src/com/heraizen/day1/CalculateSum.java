package com.heraizen.day1;

public class CalculateSum {
	int totalSum;

	public int sum(int... vals) {
		totalSum = 0;
		for(int val : vals ) {
			totalSum += val;
		}
		
		return totalSum;
	}

}

