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
    vector<int> inorderTraversal(TreeNode* root) {
        // TreeNode* T = root;
    //     stack<TreeNode*> S;
        vector<int> res;
    //     while(T!=NULL){
    //         S.push(T);
    //         T = T->left;
    //     }
    //     while(!S.empty()){
    //         T = S.top();
    //         S.pop();
    //         res.push_back(T->val);
    //         T = T->right;
    //         while(T!=NULL){
    //             S.push(T);
    //             T = T->left;
    //         }
    //     }
    //     return res;
        if (root == nullptr) return res;
        vector<int> leftTree = inorderTraversal(root->left);
        res.insert(res.end(),leftTree.begin(),leftTree.end());
        res.push_back(root->val);
        vector<int> rightTree = inorderTraversal(root->right);
        res.insert(res.end(),rightTree.begin(),rightTree.end());
        return res;
    }
};