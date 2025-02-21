public class leetcode34 {
    public static int[] searchRange(int[] nums, int target) {

        int[] A = { -1, -1 };
        int start = Search(nums, target, true);
        int end = Search(nums, target, false);
        A[0] = start;
        A[1] = end;
        return A;

    }

    public static int Search(int[] A, int target, boolean postionOfIndex) {
        int start = 0;
        int end = A.length;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > A[mid]) {
                start = mid + 1;
            } else if (target < A[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                if (postionOfIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    public public static void main(String[] args) {

    }
}
