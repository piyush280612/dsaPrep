package Arrays;

public class EquilibriumIndex {
    public static int findEquilibrium(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                return i;  // equilibrium index found
            }

            leftSum += arr[i];  // update left sum
        }

        return -1; // no equilibrium point found
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2};
        int index = findEquilibrium(arr);

        if (index != -1) {
            System.out.println("Equilibrium index: " + index);
        } else {
            System.out.println("No equilibrium point found.");
        }
    }
}
