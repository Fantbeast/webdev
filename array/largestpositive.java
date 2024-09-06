import java.util.Arrays;

public class largestpositive {
    public static void main(String[] args) {
        //Solution solution = new Solution();
        int[] nums = {3, 2, -2, 5, -3};
        System.out.println(findMaxK(nums));

    }
    public static int findMaxK(int[] nums) {
        int k = 0;
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (nums[i] < 0) {
                for (int j = 0; j < nums.length; j++) {
                    if (i != j && num * -1 == nums[j]) {
                        arr[k] = nums[j];  // store the positive counterpart
                        k++;
                        break;  // no need to check further for this num
                    }
                }
            }
        }

        if (k == 0) {
            return -1;  // return -1 if no such k exists
        }

        // Find the maximum in the collected array
        int max = arr[0];
        for (int i = 1; i < k; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

}
