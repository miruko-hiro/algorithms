package Easy;

public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        for(int i = 0; i<indices.length; i++){
            result[indices[i]] = s.charAt(i);
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        var ob = new ShuffleString();
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(ob.restoreString(s, indices));
    }
}
