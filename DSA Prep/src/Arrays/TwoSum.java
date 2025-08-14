package Arrays;

import java.util.HashMap;
import java.util.*;

public class TwoSum {
    public static int[] findTwoSums(int[] nums, int target){
        HashMap<Integer, Integer> maps = new HashMap<>(); // key - value; (number - index)

        for (int i =0; i < nums.length; i++){
            int complement = target - nums[i];

            if (maps.containsKey(complement)){
                return new int[] {maps.get(complement), i};
            }

            maps.put(nums[i], i);

        }
        throw new IllegalArgumentException("No two sum solution found");
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 7, 11, 15};
        int target = 9;

        int[] result = findTwoSums(nums, target);
        System.out.println("Indices: " + Arrays.toString(result));
    }
}

//dekh brother yah pe karna ye hai ki hashmap sabse easy way to get the solution and as uk know it has key value pair, so
// seedhi baat mai aisa h ki samajh target h = 10, aur array mai humko 7 and 3 mila so humko actually 7 and 3 nhi chaiye humko
// humko chaiye 7 and 3 ka location isliye hum use kiye hashmap jisse hum ek side mai number and uske baju mai uska location yana ki index pass
//karre hai. bas fir loop dalo get put methods use karo and ha complement scene badiya h, usme samjh target 9 hai, and humko already 2 milgaya array mai
// so technically humko dhundna h ki 7 hai ya nhi array mai isliye complement = target - arr[i]. and contains method se check karege
// ki hai ya nhi and done