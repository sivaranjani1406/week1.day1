package week1day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {

		int[] data = { 3, 2, 11, 4, 6, 7 };

		Arrays.sort(data);

		for (int i = 0; i < data.length; i++) {
			System.out.println("Sorted number " + data[i]);
		}
		int length = data.length;
		System.out.println("The second Largest number is " + data[length - 2]);

	}

}
