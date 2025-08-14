package SearchingAndSorting;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target){

        int low = 0;
        int high = arr.length - 1;

        while (low <=high){
            int mid = low + (high - low)/2;

            if (arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                low = mid+1;
            } else {
                high = mid -1;
            }
        } return -1;

    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56};
        int target = 16;

        int index = binarySearch(arr, target);
        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found.");
        }
    }

}
