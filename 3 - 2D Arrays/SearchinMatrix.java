public class SearchinMatrix {

    public static boolean Search(int Matrix[][], int key) {
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[0].length; j++) {
                // System.out.print(i + " " + j + " ");
                if (Matrix[i][j] == key) {
                    System.out.print("found at" + ' ' + i + j);
                    return true;
                }
            }
            // System.err.println("");
        }
        System.out.print("not Found");
        return false;
    }

    public static void main(String args[]) {

        int Matrix[][] = {
                { 1, 2, 3 },
                { 3, 4, 5 },
                { 6, 7, 8 }
        };
        int key = 7;
        Search(Matrix, key);
    }
}
