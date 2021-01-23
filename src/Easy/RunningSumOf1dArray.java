package Easy;

import java.util.Arrays;

public class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++){
            nums[i] += nums[i-1];
        }

        return nums;
    }

    public static void main(String[] args) {
        RunningSumOf1dArray ob = new RunningSumOf1dArray();
        int [] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(ob.runningSum(nums)));
    }
}
