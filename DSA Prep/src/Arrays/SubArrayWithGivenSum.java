package Arrays;

public class SubArrayWithGivenSum {
    public static void findTargetSum(int[] arr, int targetSum){
        int currentSum = 0;
        int start = 0;

        for (int i = 0; i < arr.length; i++){
            currentSum += arr[i];

            while (currentSum > targetSum && start < i){
                currentSum -= arr[start];
                start++;
            }

            if (currentSum == targetSum){
                System.out.println("Subarray from index " + start + " to " + i);
                return;
            }
        }
        System.out.println("No subarray found!");

    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int target = 33;
        findTargetSum(arr, target);
    }
}
