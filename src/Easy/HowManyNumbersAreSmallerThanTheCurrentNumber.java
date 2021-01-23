package Easy;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int max = 0;
            for(int j = 0; j < nums.length; j++){
                if(j != i && nums[i] > nums[j]) max++;
            }
            result[i] = max;
        }
        return result;
    }

    public static void main(String[] args) {
        var ob = new HowManyNumbersAreSmallerThanTheCurrentNumber();
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(ob.smallerNumbersThanCurrent(nums)));
    }
}
