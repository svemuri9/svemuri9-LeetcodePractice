class Solution {
    int moves;
    public int distributeCoins(TreeNode root) {
        
        moves = 0;
        dfs(root);
        return moves;
    }

    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }
        
        int leftBalance = dfs(node.left);
        int rightBalance = dfs(node.right);
        
        int balance = node.val + leftBalance + rightBalance - 1;
        moves += Math.abs(balance);
        
        return balance;
    }
}