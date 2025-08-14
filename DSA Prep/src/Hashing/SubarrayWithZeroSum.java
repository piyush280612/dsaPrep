package Hashing;

import java.util.HashSet;

public class SubarrayWithZeroSum {

    public static boolean findSubArray(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        for (int num: arr){
           sum += num;

           if (sum ==0 || set.contains(sum) || num ==0){
               return true;
           }
           set.add(sum);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
        System.out.println("Has subarray with 0 sum: " + findSubArray(arr));
    }
}
