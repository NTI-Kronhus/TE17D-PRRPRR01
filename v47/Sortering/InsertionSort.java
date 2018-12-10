package Sortering;

public class InsertionSort {

	public static void sort(int[] array) {

		int comparisons = 0;
		int swaps = 0;

		for (int j = 0; j < array.length; j++) {
			int min = array[j];
			int index = j;
			for (int i = j + 1; i < array.length; i++) {
				comparisons++;
				if (min > array[i]) {
					min = array[i];
					index = i;
				}
			}
			int temp = array[j];
			array[j] = array[index];
			array[index] = temp;
			swaps++;
		}

		System.out.println("Comparisons: " + comparisons);
		System.out.println("Swaps: " + swaps);

	}

}
