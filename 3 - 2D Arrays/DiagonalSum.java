public class DiagonalSum {

    public static int calculateSum(int arg[][]) {
        int sum = 0;
        for (int i = 0; i < arg.length; i++) {
            // System.err.println(arg[i][i]);
            // System.err.println(arg[i][arg.length - 1 - i]);
            // i + n = arg.length - 1

            sum += arg[i][i];
            if (i !=  arg.length - 1 - i) {
                sum += arg[i][arg.length - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        int arg[][] = {
                { 1, 1, 3 },
                { 1, 2, 1 },
                { 6, 1, 3 }
        };
        System.err.println(calculateSum(arg));
        ;
    }
}
