package Medium;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    public int minPartitions(String n) {
        char[] charArray = n.toCharArray();
        int max = 0;

        for (int i = 0; i < charArray.length; i++){
            int count = Character.getNumericValue(charArray[i]);
            if (max < count) max = count;
        }

        return max;
    }

    public static void main(String[] args) {
        var ob = new PartitioningIntoMinimumNumberOfDeciBinaryNumbers();
        String n = "27346209830709182346";
        System.out.println(ob.minPartitions(n));
    }
}
