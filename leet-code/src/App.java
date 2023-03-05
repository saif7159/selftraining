import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // int[] arr = new int[] { 1, 3, 5, 6 };
        // System.out.println(searchInsert(arr, 7));
        Solution1 solution1 = new Solution1();
        int nums[] = new int[20000];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<20000; i++){
            nums[i] = 1;
        }
        solution1.canJump(nums);
    }

    public static int searchInsert(int[] nums, int target) {
        return bsearch(nums, target, 0, nums.length - 1);
    }

    public static int bsearch(int[] num, int target, int l, int r) {
        int mid = (l + (r - l)) / 2;
        if (r >= l) {

            if (target < num[mid]) {
                return bsearch(num, target, l, mid - 1);
            } else if (target > num[mid]) {
                return bsearch(num, target, mid + 1, r);
            } else {
                return mid;
            }

        }
        return mid;
    }
}
