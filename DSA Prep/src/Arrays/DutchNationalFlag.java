package Arrays;
import java.util.*;

public class DutchNationalFlag {

    public static void sortDutchFlag(int[] nums){
        int low = 0;
        int mid =0; //current position
        int high = nums.length - 1;

        while (mid <= high){
            if (nums[mid] == 0){
                int temp1 = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp1;
                low++;
                mid++;
            } else if (nums[mid] ==1) {
                mid++;
            } else {
                int temp2 = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp2;
                high--;
            }
        }

    }
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortDutchFlag(nums);
        System.out.println("Sorted: " + Arrays.toString(nums));
    }
}
