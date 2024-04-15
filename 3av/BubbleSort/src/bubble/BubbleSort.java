package bubble;

import java.util.Arrays;

// Java program for implementation of Bubble Sort 

public class BubbleSort {
	public int[] sort(int[] arr) {

		for (int i = 1; i < arr.length; i++)

			for (int j = 0; j <= arr.length - i - 1; j++)

				if (arr[j] > arr[j + 1]) { // swap temp and arr[i]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
		return arr;
	}

	// Driver method to test above
	public static void main(String args[]) {
		BubbleSort ob = new BubbleSort();
		int[] arr = { 64,34,25,12,22,11,90 };
		ob.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//First iteration {34,25,12,22,11,64,90}
		//Second iteration {25,12,22,11,34,64,90}
		//Third iteration {12,22,11,25,34,64,90}
		//Fourth iteration {12,11,22,25,34,64,90}
		//Last iteration {11,12,22,25,34,64,90}
		
	}
}
