package Easy;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> bools = new ArrayList<>();
//        int [] tempArray = candies.clone();
//        Arrays.sort(tempArray);
//        int max = tempArray[tempArray.length - 1];
//        tempArray = null;
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (max < candies[i]) max = candies[i];
        }

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies < max) {
                bools.add(false);
            } else {
                bools.add(true);
            }
        }
        return bools;
    }

    public static void main(String[] args) {
        var ob = new KidsWithTheGreatestNumberOfCandies();
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(ob.kidsWithCandies(candies, extraCandies));
    }
}
