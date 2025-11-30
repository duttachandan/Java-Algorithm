public class SpiralMatrix {

    public static void SpiralPrint(int arg[][]) {
        int startRow = 0;
        int startCol = 0;
        int EndRow = arg.length - 1;
        int EndCol = arg[0].length - 1;
        while (startRow <= EndRow && startCol <= EndCol) {
            for (int j = 0; j <= arg[0].length - 1; j++) {
                System.out.print(arg[startRow][j]);
            }
            System.out.println(" ");
            for (int i = 1; i < arg.length; i++) {
                System.out.print(arg[i][EndCol]);
            }
        }
    }

    public static void main(String args[]) {
        int arg[][] = {
            { 3, 2, 4 },
            { 2, 4, 6 },
            { 1, 3, 5 }
        };
        SpiralPrint(arg);
    }
}
