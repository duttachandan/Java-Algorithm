import java.util.Arrays;

public class CountingSort {

    /*
     * Counting Sort is an integer sorting algorithm that works well when:
     * - The range of input values (0..k) is not too large compared to the number of
     * elements.
     * 
     * How it works:
     * ----------------------------------------------------
     * 1. Find the largest value in the array. This tells us how big
     * the counting array needs to be.
     * 
     * 2. Create a "count" array where each index represents a value
     * from the original array, and the value at each index stores
     * how many times that number appears.
     * 
     * 3. Traverse the input array and, for each element 'x',
     * increment count[x]. This builds the frequency table.
     * 
     * 4. Rebuild the original array:
     * - Go through the count array from index 0 to 'largest'.
     * - For each index 'i', while count[i] > 0:
     * - Put 'i' back into the original array.
     * - Decrease count[i].
     * This writes the numbers back in sorted order.
     * 
     * Time Complexity:
     * ----------------------------------------------------
     * - Time: O(n + k)
     * where n = number of elements, k = range of input values
     * - Space: O(k) for the count array
     * 
     * Note:
     * ----------------------------------------------------
     * - Works only for integers (typically non-negative).
     * - Very efficient when the range of numbers is small
     * compared to the number of elements.
     */

    public static void main(String args[]) {
        int arg[] = { 1, 3, 4, 5, 6, 7, 2 };

        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arg.length; i++) {
            if (largest < arg[i]) {
                largest = arg[i];
            }
        }

        int count[] = new int[largest + 1];

        for (int i = 0; i < arg.length; i++) {
            count[arg[i]]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arg[j] = i;
                j++;
                count[i]--;
            }
        }

        System.out.print(Arrays.toString(arg));

    }
}
