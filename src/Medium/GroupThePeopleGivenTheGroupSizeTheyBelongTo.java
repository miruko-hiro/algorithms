package Medium;

import java.util.ArrayList;
import java.util.List;

public class GroupThePeopleGivenTheGroupSizeTheyBelongTo {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < groupSizes.length; i++) {
            if (groupSizes[i] != 0) {
                ArrayList<Integer> group = new ArrayList<>();
                int number = groupSizes[i];
                group.add(i);
                groupSizes[i] = 0;
                int count = 1;
                for (int j = 0; j < groupSizes.length; j++) {
                    if (count == number) {
                        break;
                    } else if (groupSizes[j] != 0 && number == groupSizes[j]) {
                            count++;
                            group.add(j);
                            groupSizes[j] = 0;
                    }
                }
                result.add(group);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        var ob = new GroupThePeopleGivenTheGroupSizeTheyBelongTo();
        int[] groupSizes = {3,3,3,3,3,1,3};
        System.out.println(ob.groupThePeople(groupSizes));
    }
}
