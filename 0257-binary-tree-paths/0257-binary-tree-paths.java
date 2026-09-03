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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root != null) {
            dfs(root, new StringBuilder(), result);
        }
        return result;
    }

    private void dfs(TreeNode node, StringBuilder sb, List<String> result) {
        // Record the current length of the StringBuilder for backtracking
        int currentLength = sb.length();
        
        // Append the current node's value
        sb.append(node.val);

        // Base case: If it's a leaf node, add the constructed path to our list
        if (node.left == null && node.right == null) {
            result.add(sb.toString());
        } else {
            // Otherwise, append the arrow indicator and traverse deeper
            sb.append("->");
            if (node.left != null) {
                dfs(node.left, sb, result);
            }
            if (node.right != null) {
                dfs(node.right, sb, result);
            }
        }

        // Backtrack: Reset the StringBuilder length to its state before this node was added
        sb.setLength(currentLength);
    }
}