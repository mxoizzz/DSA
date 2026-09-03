/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> S = new Stack<>();
        List<Integer> res = new ArrayList<>();
        TreeNode T = root;
        while(T!=null) {
            S.push(T);
            T = T.left;
        }
        while(!S.isEmpty()){
            T = S.pop();
            res.add(T.val);
            T = T.right;
            while(T!=null) {
                S.push(T);
                T = T.left;
            }
        }
        return res;
    }
}