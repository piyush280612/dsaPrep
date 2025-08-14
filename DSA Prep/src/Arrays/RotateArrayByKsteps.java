package Arrays;
import java.util.*;

public class RotateArrayByKsteps {

    public static void rotate(int[] arr, int k){
        int n = arr.length;
        k = k% n;

        reverse(arr, 0, n-1); // first reverse the entire array {1,2,3,4,5} becomes {5,4,3,2,1}
        reverse(arr, 0, k-1); // now reverse till k elements like suppose k = 2 then {4,5,3,2,1}
        reverse(arr, k, n-1); // now reverse the remaining array i.e. {4,5,1,2,3} which is the final answer

    }

    public static void reverse(int[] arr, int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotate(nums, k);

        System.out.println("Rotated Array: " + Arrays.toString(nums));
    }
}
