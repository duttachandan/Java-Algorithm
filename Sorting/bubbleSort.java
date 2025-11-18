import java.util.*;

/*
 Bubble sort is a simple sorting algorithm that repeatedly compares adjacent elements and swaps them if they are in the wrong order until 
 the list is sorted. It works by making passes through the list, with larger elements "bubbling up" to the end in each pass. 
 While easy to understand and implement, it is inefficient for large datasets, with an average and worst-case time complexity of \(O(n^{2})\). 
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