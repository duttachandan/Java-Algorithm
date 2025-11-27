import java.util.*;

/*
 Bubble Sort is one of the simplest sorting algorithms.

 How it works:
 -----------------------------------------
 - It repeatedly compares each pair of adjacent elements.
 - If the left element is greater than the right element, they are swapped.
 - After every full pass through the array, the largest unsorted element
   "bubbles up" to its correct position at the end of the array.

 Key points:
 -----------------------------------------
 - The outer loop controls the number of passes through the array.
 - The inner loop compares adjacent elements and performs swaps if needed.
 - With every pass, the last 'i' elements are already sorted,
   so the inner loop runs fewer times (arr.length - i - 1).

 Time Complexity:
 -----------------------------------------
 - Worst & average case: O(n²)
 - Best case (already sorted): O(n)

 Although Bubble Sort is easy to understand and implement,
 it is not efficient for large datasets.
*/


public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = { 3, 8, 10, 5, 7, 2, 1, 0 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int replaceValue;
                    replaceValue = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = replaceValue;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}