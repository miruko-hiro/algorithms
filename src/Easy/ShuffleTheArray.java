package Easy;

import java.util.Arrays;

public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] array = new int [nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i += 2){
            array[i] = nums[j];
            j ++;
        }
        j = 0;
        for (int i = 1; i < nums.length; i += 2){
            array[i] = nums[n + j];
            j ++;
        }
        return array;
    }

    public static void main(String[] args) {
        var ob = new ShuffleTheArray();
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(ob.shuffle(nums, n)));
    }


}
