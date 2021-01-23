package Medium;

public class FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        TreeNode result = null;
        if(original.equals(target)){
            result = cloned;
        } else {
            if(original.left != null) {
                TreeNode resultGet = getTargetCopy(original.left, cloned.left, target);
                if (resultGet != null) result = resultGet;
            }
            if(original.right != null){
                TreeNode resultGet = getTargetCopy(original.right, cloned.right, target);
                if (resultGet != null) result = resultGet;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        var ob = new FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree();

        TreeNode original = new TreeNode(7);
        original.left = new TreeNode(4);
        TreeNode originalRight = new TreeNode(3);
        original.left = new TreeNode(6);
        original.right = new TreeNode(19);
        original.right = originalRight;

        TreeNode cloned = new TreeNode(7);
        cloned.left = new TreeNode(4);
        TreeNode clonedRight = new TreeNode(3);
        cloned.left = new TreeNode(6);
        cloned.right = new TreeNode(19);
        cloned.right = clonedRight;

        System.out.println(original.right);
        System.out.println(ob.getTargetCopy(original, cloned, original.right));
    }
}
