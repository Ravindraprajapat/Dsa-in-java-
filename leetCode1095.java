/**
 * leetCode1095
 */
public class leetCode1095 {

    public static void main(String[] args) {
        int A[] = { 2, 5, 6, 7, 9, 10, 3, 4, 0, 1 };
        int res = Search(A, 3);
        System.out.println(res);

    }

    public static int Search(int A[], int target) {
        int peak = PeakindexOfMountainArray(A);
        int fristry = OrderAgnosticArraySearch(A, target, 0, peak);
        if (fristry != -1) {
            return fristry;
        }
        return OrderAgnosticArraySearch(A, target, peak + 1, A.length - 1);

    }

    public static int PeakindexOfMountainArray(int[] A) {
        int start = 0;
        int end = A.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (A[mid] > A[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int OrderAgnosticArraySearch(int[] A, int target, int start, int end) {
        boolean isAss = A[start] < A[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
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