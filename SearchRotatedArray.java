public class SearchRotatedArray {
    public static void main(String[] args) {
        int A[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(FindPivot(A));
    }

    public static int search(int[] nums, int target) {

        int pivot = FindPivot(nums);
        if (pivot == -1) {
            return binarySearch1(nums, target, 0, nums.length - 1);
        }

        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return binarySearch1(nums, target, 0, pivot - 1);

        }
        return binarySearch1(nums, target, pivot + 1, nums.length - 1);
    }

    public static int binarySearch1(int[] A2, int target, int start, int end) {

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

    public static int FindPivot(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }
}
