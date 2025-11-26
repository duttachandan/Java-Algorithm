import java.util.Arrays;

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
