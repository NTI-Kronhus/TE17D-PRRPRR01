package Sortering;

public class BubbleSort {

	public static void sort(int[] array) {
		int comparisons = 0;
		int swaps = 0;
		boolean hasSwapped = true;
		for (int j = 0; j < array.length && hasSwapped; j++) {
			hasSwapped = false;
			for (int i = 0; i < array.length - 1 - j; i++) {
				comparisons++;
				if (array[i] > array[i + 1]) {
					int temp = array[i + 1];
					array[i + 1] = array[i];
					array[i] = temp;
					swaps++;
					hasSwapped = true;
				}
			}
		}

		System.out.println("Comparisons: " + comparisons);
		System.out.println("Swaps: " + swaps);
	}

}
