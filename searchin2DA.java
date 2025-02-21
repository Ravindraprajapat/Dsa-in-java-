
public class searchin2DA {
    public static void main(String[] args) {
        int A[][] = {
                { 10, 20, 30 },
                { 11, 21, 33 },
                { 13, 25, 35 },
                { 15, 27, 40 }
        };
        int[] result = search(A, 35);
        if (result[0] != -1) {
            System.out.println("Element found at: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("Element not found.");
        }
    }

    public static int[] search(int matrix[][], int target) {
        int r = 0;
        int c = matrix[0].length - 1;
        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[] { r, c };
            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[] { -1, -1 };
    }

}
