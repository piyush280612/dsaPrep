package Arrays;

import java.util.HashSet;

public class findDuplicatesInArray {

    public static int findDuplicate(int[] nums){
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums){
            if (seen.contains(num)){
                return num;
            }
            seen.add(num);
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        int duplicate = findDuplicate(arr);
        System.out.println("Duplicate number is: " + duplicate);
    }
}
