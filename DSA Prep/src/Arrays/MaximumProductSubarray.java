package Arrays;

public class MaximumProductSubarray {
    public static int maxProduct(int[] nums) {
        int maxProd = nums[0];     // final result
        int currMax = nums[0];     // current max product ending at i
        int currMin = nums[0];     // current min product ending at i

        for (int i = 1; i < nums.length; i++) {
            int temp = currMax;

            // Either start fresh or extend previous product
            currMax = Math.max(nums[i], Math.max(currMax * nums[i], currMin * nums[i]));
            currMin = Math.min(nums[i], Math.min(temp * nums[i], currMin * nums[i]));

            maxProd = Math.max(maxProd, currMax);  // update final result
        }

        return maxProd;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println("Max product subarray: " + maxProduct(nums));
    }
}
