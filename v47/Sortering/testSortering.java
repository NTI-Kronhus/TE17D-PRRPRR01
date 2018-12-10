package Sortering;

import java.util.Arrays;

public class testSortering {

	
	public static void main(String[] args) {
		
		int[] tal = {1,2,3,6,3,2,5,87,2,45,8,4,2,4,8,3,3,68,97,23,37};
		int[] tal2 = {1,2,3,6,3,2,5,87,2,45,8,4,2,4,8,3,3,68,97,23,37};
		
		InsertionSort.sort(tal);
		System.out.println(Arrays.toString(tal));
		BubbleSort.sort(tal2);
		System.out.println(Arrays.toString(tal2));
		
	}
}
