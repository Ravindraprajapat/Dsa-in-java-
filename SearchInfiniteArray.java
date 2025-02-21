public class SearchInfiniteArray {

    public static void main(String[] args) {

        int[] A = { 2, 4, 7, 10, 45, 78, 89, 99, 101, 115, 120, 134, 159, 190 };
        int target = 89;
        System.out.println(Ans(A, target));
    }

    public static int Ans(int[] A, int target) {
        int start = 0;
        int end = 1;

        while (target > A[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;// increasing the size of searching range
            start = temp;
        }
        return BinarySearch(A, target, start, end);
    }

    public static int BinarySearch(int[] A, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (A[mid] > target) {
                end = mid - 1;
            } else if (A[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
