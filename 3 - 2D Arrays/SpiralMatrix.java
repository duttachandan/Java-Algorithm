public class SpiralMatrix {

    public static void SpiralPrint(int arg[][]) {
        int startRow = 0;
        int startCol = 0;
        int EndRow = arg.length - 1;
        int EndCol = arg[0].length - 1;
        while (startRow <= EndRow && startCol <= EndCol) {
            // System.err.println(EndCol > startCol);
            // System.err.println(EndRow > startRow);

            // if (EndRow == startRow && EndCol == startCol) {
            //     System.err.print(arg[startRow][EndRow]);
            //     break;
            // }

            for (int j = startCol; j <= EndCol; j++) {
                System.out.print(arg[startRow][j]);
            }
            for (int i = startRow + 1; i <= EndRow; i++) {
                System.out.print(arg[i][EndCol]);
            }
            for (int i = EndCol - 1; i >= startCol; i--) {
                System.out.print(arg[EndRow][i]);
            }
            for (int j = EndRow - 1; j >= startRow + 1; j--) {
                System.out.print(arg[j][startCol]);
            }

            startRow++;
            startCol++;
            EndCol--;
            EndRow--;
            // System.err.println(" ");
            // System.out.println(EndRow + " " + startRow + " " + EndCol + " " + startCol);
            // System.out.println(" ");

        }
    }

    public static void main(String args[]) {

        int arg[][] = {
                { 3, 2, 4 },
                { 2, 4, 6 },
                { 1, 3, 5 }
        };

        int arg2[][] = {
            {4, 6, 7, 8},
            {1, 3, 4, 5},
            {9, 2, 3, 1},
            {4, 8, 6, 2}
        };
        SpiralPrint(arg);
        System.err.println();
        SpiralPrint(arg2);
    }
}
