package Hashing;

import java.util.HashMap;

public class AllPairsWithGivenSum {

    public static void findPairs(int[] arr, int target){

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr){
            int complement = target - num;

            if (map.containsKey(complement)){
                int freq = map.get(complement);
                for (int i = 0; i < freq; i++){
                    System.out.println("(" + complement + "," + num + ")");
                }
            }

            map.put(num, map.getOrDefault(num,0)+ 1);

        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int target = 6;
        findPairs(arr, target);
    }
}
