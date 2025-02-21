public class Celing_ofNo {
    //

    // find floor of number scroll down

    // celing of number means a when target element is not found return a number
    // greater than equal to and smallest number
    public static void main(String[] args) {

        int[] A = { 2, 7, 45, 67, 88, 99, 101, 105, 110 };
        int res = Celling(A, 111);
        System.out.println(res);
    }

    public static int Celling(int[] A2, int target) {
        int start = 0;
        int end = A2.length - 1;
        if (target > A2[A2.length - 1]) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (A2[mid] > target) {
                end = mid - 1;
            } else if (A2[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;

        // when we find a celling of a number return a start;
        // when we find a floor of a number return a end;

        // floor of a number means a when target element is not found return a number
        // lesser than equal to and biggest number

    }

}

// solution of a leet code problem 744;
/*
 * class Solution {
 * public char nextGreatestLetter(char[] letters, char target) {
 * int start = 0;
 * int end = letters.length - 1;
 * 
 * while (start <= end) {
 * int mid = start + (end - start) / 2;
 * 
 * if (letters[mid] > target) {
 * end = mid - 1;
 * } else{
 * start = mid + 1;
 * 
 * }
 * 
 * }
 * return letters[start % letters.length];
 * 
 * }
 * }
 */
