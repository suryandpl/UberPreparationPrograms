package com.wipro.misc;

public class MiddleIndex {

	public static int findMiddleIndex(int[] numbers) throws Exception {

		int endIndex = numbers.length - 1;
		int startIndex = 0;
		int sumLeft = 0;
		int sumRight = 0;
		while (true) {
			if (sumLeft > sumRight) {
				sumRight += numbers[endIndex--];
			} else {
				sumLeft += numbers[startIndex++];
			}
			if (startIndex > endIndex) {
				if (sumLeft == sumRight) {
					break;
				} else {
					throw new Exception("Please pass proper array to match the requirement");
				}
			}
		}
		return endIndex;
	}

	public static void main(String a[]) {
		int[] num = { 2, 4, 4, 5, 4, 1 };
		try {

			findMiddleIndex(num);

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}