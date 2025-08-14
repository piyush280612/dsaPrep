package SearchingAndSorting;

public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Found the element at index i
            }
        }
        return -1; // Not found
    }

    public static void main(String[] args) {
        int[] arr = {10, 30, 50, 70, 90};
        int target = 70;

        int index = linearSearch(arr, target);
        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}
