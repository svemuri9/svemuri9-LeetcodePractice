/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    void dfs(TreeNode* root, vector<string>& result, string curr) {
        if(!root)   return;
        curr = curr + to_string(root->val);
        if(!root->left && !root->right)
        {
            result.push_back(curr);
        }
        curr = curr + "->";
        if(root->left)  dfs(root->left, result, curr);
        if(root->right) dfs(root->right, result, curr);
    }

    vector<string> binaryTreePaths(TreeNode* root) {
        vector<string> result;
        if(!root)   return result;
        dfs(root, result, "");
        return result;
    }
};