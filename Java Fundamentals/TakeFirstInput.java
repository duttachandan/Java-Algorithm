import java.util.*;

public class TakeFirstInput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double takeDouble = sc.nextDouble();
        System.err.println(takeDouble);
        sc.close();
    }
}