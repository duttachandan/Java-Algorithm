import java.util.Arrays;

/*
 Insertion Sort is a simple and intuitive sorting algorithm.

 How it works:
 ----------------------------------------------------
 1. The array is divided into two parts:
      - A sorted portion on the left
      - An unsorted portion on the right
    Initially, the first element is considered sorted.

 2. Starting from index 1, each element (called 'curr')
    is picked from the unsorted section.

 3. The algorithm then compares 'curr' with the elements in the
    sorted portion (from right to left).

 4. As long as elements in the sorted part are greater than 'curr',
    they are shifted one position to the right to make space.

 5. Once the correct position is found, 'curr' is placed in that spot.
    This expands the sorted region by one element.

 6. These steps repeat until all elements are inserted into their
    correct positions and the entire array becomes sorted.

 Time Complexity:
 ----------------------------------------------------
 - Worst & average case: O(n²) (shifting for every element)
 - Best case: O(n) when the array is already sorted
 - Works well for small datasets or nearly sorted arrays.

 Key idea:
 ----------------------------------------------------
 Insert each element into its correct position
 inside the already-sorted part of the array.
*/


public class insertionSort {
    public static void main(String args[]) {
        int arg[] = { 3, 7, 9, 5, 4, 2, 1 };

        for (int i = 1; i < arg.length; i++) { // 1, 2, 3
            int curr = arg[i];
            int prev = i - 1;
            // Finding the where to start insertion sort
            while (prev >= 0 && arg[prev] > curr) {
                arg[prev + 1] = arg[prev]; // 3>7 , 7>9, 9>5 = 5,0...
                prev--;
            }
            arg[prev + 1] = curr;// 3, 7, (5 , 9)...
        }
        System.out.print(Arrays.toString(arg));
    }
}
