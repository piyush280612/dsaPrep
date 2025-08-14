package Arrays;

import java.util.*;

public class MergeTwoSortedArraysInPlace {
    public static void MergeArrays(int arr1[], int m, int arr2[], int n) {

        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (arr1[p1] > arr2[p2]) {
                arr1[p] = arr1[p1];
                p1--;
            } else {
                arr1[p] = arr2[p2];
                p2--;
            }
            p--;
        }

        //if any elements left in arr2
        while (p2 >= 0) {
            arr1[p] = arr2[p2];
            p2--;
            p--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;

        MergeArrays(nums1, m, nums2, n);

        System.out.println("Merged Array: " + Arrays.toString(nums1));
    }
}
