package Hashing;

import java.util.*;

public class FirstRepeatingElement {

    public static int firstRepeating(int[] arr) {
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (seen.contains(num)) {
                return num;  // first repeating element found
            }
            seen.add(num);
        }

        return -1; // no repeating element found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 3};
        System.out.println("First Repeating Element: " + firstRepeating(arr));
    }
}
