import java.util.*;

/*
 
    1. The input array is conceptually divided into two parts: 
    a sorted subarray at the beginning and an unsorted subarray at the end. Initially, 
    the sorted part is empty, and the unsorted part comprises the entire array.

    2. In each iteration, the algorithm scans the unsorted subarray to locate the element with the smallest value.

    3. The smallest element found in the unsorted subarray is then swapped with the first element of the unsorted subarray. 
    This effectively moves the smallest element to its correct position in the sorted part of the array.

    4.The boundary between the sorted and unsorted subarrays shifts one position to the right, 
    expanding the sorted portion and shrinking the unsorted portion. 

    5. Steps 2-4 are repeated until the entire array becomes sorted, meaning the unsorted subarray is empty.

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
