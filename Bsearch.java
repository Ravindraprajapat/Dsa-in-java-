
public class Bsearch {

    public static void main(String[] args) {

        int[] A = { 2, 7, 45, 67, 88, 99, 101, 105, 110 };
        int res = binarySearch1(A, 101);
        System.out.println(res);
    }

    public static int binarySearch1(int[] A2, int target) {
        int start = 0;
        int end = A2.length - 1;
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
        return -1;
    }

}