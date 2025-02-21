public class OrderAgnosticArray {

    public static void main(String[] args) {
        int[] A = { 1, 4, 5, 6, 7, 8, 2, 3, 5, 0 };
        int res = OrderAgnosticArraySearch(A, 0);
        System.out.println(res);

    }

    public static int OrderAgnosticArraySearch(int[] A, int target) {
        int start = 0;
        int end = A.length - 1;
        boolean isAss = A[start] < A[end];
        while (start <= end) {
            int mid = start + (end - start / 2);
            if (A[mid] == target) {
                return mid;
            }
            if (isAss) {
                if (target > A[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < A[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
