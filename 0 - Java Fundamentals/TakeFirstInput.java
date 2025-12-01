// how to take any input from the user

import java.util.*;

public class TakeFirstInput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double takeDouble = sc.nextDouble();
        // In this way you can take double input from the user
        // ifyou want to take something else as input you will have to use other inputs
        // like nextInt(), nextByte(), next();
        System.err.println(takeDouble);
        sc.close();
    }
}

