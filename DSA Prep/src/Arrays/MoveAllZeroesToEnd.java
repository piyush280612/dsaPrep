package Arrays;

import java.util.*;

public class MoveAllZeroesToEnd {
    public static void MoveZeroesToEnd(int[] nums){
         int nonZeroIndex = 0;

         for (int i =0; i < nums.length; i++){
             if (nums[i] != 0){
                 nums[nonZeroIndex] = nums[i];
                 nonZeroIndex++;
             }
         }
         while (nonZeroIndex < nums.length){
             nums[nonZeroIndex] = 0;
             nonZeroIndex++;
         }

    }
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        MoveZeroesToEnd(nums);
        System.out.println("After moving zeroes: " + Arrays.toString(nums));
    }
}
