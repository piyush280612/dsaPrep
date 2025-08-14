package Arrays;

public class MissingNumberInAnArray {

    public static int findMissingVal(int[] arr){
        int n = arr.length;

        int expectedSum = n * (n+1)/2;
        int actualSum =0;

        for (int num : arr){
            actualSum += num;
        }
        int missingNumber = expectedSum - actualSum;
        return missingNumber;

    }
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};  // missing = 2
        int missing = findMissingVal(arr);
        System.out.println("Missing number is: " + missing);
    }
}
