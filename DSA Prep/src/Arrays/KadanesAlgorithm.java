package Arrays;

public class KadanesAlgorithm {
    public static int maxSubArray(int[] nums){
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++){
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + maxSubArray(nums));
    }
}

//dekh isme concept aisa h ki ek lambi array di hui rahegi jisme negative numbers hogi and fir usme kuch arrays milake ya maybe sare array
// milake ek sum banega jo mostly positive rahega, ab dhundna ye h ki kya maximum sun ban sakta h, so iske liye hum kar aisa rhe h ki
// maximum sum ko index 0 and current sum ko bhi index 0 assign karre h, fir as humko current sum chaiye so samjh array mai start -2 hai
// means currentSum = -2 , maxSum = -2, soooo abhi loop k andar current sum hum index 1 se start karege, soo dekh
// index 1 pe baitha h 1, so ab Maximum ( 1, 1-2) = 1 aayega so same jab max sum mai niaklege to maximum update hoga 1 mai
//aise karte karte fir ek bada number aayega