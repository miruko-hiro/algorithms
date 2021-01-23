package Easy;

public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        var charArray = stones.toCharArray();
        int count = 0;
        for(int j = 0; j < jewels.length(); j++){
            for(int i = 0; i < charArray.length; i++) {
                if (jewels.charAt(j) == charArray[i]) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        var ob = new JewelsAndStones();
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(ob.numJewelsInStones(jewels, stones));
    }
}
