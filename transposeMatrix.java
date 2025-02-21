import java.util.*;

public class transposeMatrix {
    public static int[][] Traspose(int[][] A, int r, int c) {
        int ans[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j] = A[j][i];
            }

        }
        return ans;

    }

    public static void printArray(int A[][], int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int row = 3, col = 3;
        int[][] Ab = new int[row][col];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a element of a matrix :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                Ab[i][j] = sc.nextInt();
            }
        }
        printArray(Ab, row, col);
        System.out.println("transpose of a matrix:");
        int[][] answ = Traspose(Ab, row, col);
        printArray(answ, col, row);
    }
}
