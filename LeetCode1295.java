/*public class LeetCode1295 {
    static int FindNumbera(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberofDigits = digits(num);
        // if (numberofDigits % 2 == 0) {
        // return true;
        // }
        return numberofDigits % 2 == 0;
    }

    static int digits(int num) {

        if (num < 0) {
            num = num * -1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = { 12, 345, 2, 6, 7896 };
        System.out.println(FindNumbera(a));
    }
}*/

//Search in a 2D array 
/**
 * LeetCode1295
 */
public class LeetCode1295 {

    public static boolean searchMatrix(int[][] matrix, int target) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int A[][] = {
                { 1, 4, 2 },
                { 3, 6, 3 },
                { 7, 8, 4 }
        };
        System.out.println(searchMatrix(A, 1));
    }
}
