import java.util.*;

/*
 Selection Sort is a simple comparison-based sorting algorithm.

 How it works:
 ----------------------------------------------------
 1. The array is divided into two parts:
      - A sorted section at the beginning
      - An unsorted section at the end
    Initially, the sorted section is empty.

 2. For each position 'i' in the array, the algorithm searches
    the unsorted section (i to end) to find the smallest element.

 3. Once the smallest element is found, it is swapped with the
    element at position 'i'. This places the smallest value
    into its correct sorted position.

 4. The boundary between the sorted and unsorted portions shifts
    one step to the right, increasing the sorted section.

 5. Repeat these steps until the entire array is sorted and
    no unsorted elements remain.

 Time Complexity:
 ----------------------------------------------------
 - Worst, average, and best case: O(n²)
 - Selection Sort performs well on small arrays
   but is not efficient for large datasets.

 Key idea:
 ----------------------------------------------------
 Always select the smallest element from the remaining
 unsorted portion and place it in the correct position.
*/



public class SelectionSort {
    public static void main(String[] args) {
        int arg[] = { 8, 3, 7, 6, 5 };
        for (int i = 0; i < arg.length; i++) {
            int minpos = i; // 8
            for (int j = i + 1; j < arg.length; j++) {
                if (arg[j] < arg[minpos]) {
                    minpos = j;
                }
            }
            int temp = arg[i];
            arg[i] = arg[minpos];
            arg[minpos] = temp;
        }

        System.out.print(Arrays.toString(arg));
    }

}
