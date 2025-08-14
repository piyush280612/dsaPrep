package Hashing;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingChar {

    public static int  longestSubstring(String str){

        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLength =0;

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            //in case of duplicates
            while (set.contains(ch)){
                set.remove(str.charAt(left));
                left++;
            }

            set.add(ch);
            maxLength = Math.max(maxLength, i - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbbfghijkl";
        System.out.println("Longest length: " + longestSubstring(s));
    }
}
