import java.util.*;

public class twoDArrays {
    public static void main(String args[]) {

        int threeMatrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        // threeMatrix.length returns the total number of rows in the matrix
        // threeMatrix[0].lenght returns the total number of columns in the matrix
        for (int i = 0; i < threeMatrix.length; i++) {
            for (int j = 0; j < threeMatrix[0].length; j++) {
                int data = sc.nextInt();
                threeMatrix[i][j] = data;
            }
        }
        sc.close();
        for (int i = 0; i < threeMatrix.length; i++) {
            for (int j = 0; j < threeMatrix[0].length; j++) {
                System.out.print(threeMatrix[i][j] + " ");
            }
            System.out.println("");
        }
    };
}
