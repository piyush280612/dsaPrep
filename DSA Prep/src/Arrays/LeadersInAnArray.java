package Arrays;

import java.util.*;

public class LeadersInAnArray {
    public static List<Integer> findLeaders(int[] nums) {
        List<Integer> leaders = new ArrayList<>();
        int n = nums.length;

        if (n == 0) return leaders; // empty input
        if (n == 1) {
            leaders.add(nums[0]);   // single element is always a leader
            return leaders;
        }
        int maxFromRight = nums[n - 1];
        leaders.add(maxFromRight);

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] > maxFromRight) {
                maxFromRight = nums[i];
                leaders.add(maxFromRight);
            }
        }

        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        List<Integer> leaders = findLeaders(arr);
        System.out.println("Leaders: " + leaders);
    }
}
//leaders in array ka bhai yad karle ki arraylist use karna h and piche se check karna h
//sbse impo baat array mai 0 element nhi hona chaiye and 1 bhi nhi minimum do toh us hisab se configure kariyo warna indexoutofbound error aayega
