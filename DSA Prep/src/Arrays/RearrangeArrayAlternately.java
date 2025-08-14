package Arrays;

import java.util.*;

public class RearrangeArrayAlternately {

    public static int[] rearrangeArr(int[] arr) {

        int n = arr.length;
        int[] result = new int[n];

        int start = 0;
        int end = n - 1;
        boolean pickMax = true;

        for (int i = 0; i < n; i++) {
            if (pickMax) {
                result[i] = arr[end]; //pick max value
                end--;
            } else {
                result[i] = arr[start];
                start++;
            }
            pickMax = !pickMax;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int[] output = rearrangeArr(nums);

        System.out.println("Rearranged: " + Arrays.toString(output));
    }
}
