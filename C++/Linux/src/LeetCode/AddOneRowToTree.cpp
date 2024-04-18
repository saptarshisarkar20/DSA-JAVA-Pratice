#include <iostream>
#include <bits/stdc++.h>
#include <string>
#include <cmath>
using namespace std;

// ###############################################

//  Definition for a binary tree node.
struct TreeNode
{
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

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
class Solution
{
public:
    void addNode(TreeNode *root, int val)
    {
        // cout<<root->val<<endl;
        TreeNode *tempR = root->right;
        TreeNode *tempL = root->left;

        // cout<<tempR->val<<endl;
        root->left = new TreeNode(val);
        root->left->left = tempL;

        root->right = new TreeNode(val);
        root->right->right = tempR;
    }

    void solAdd(TreeNode *root, int val, int de)
    {
        // cout << de << " | " << root->val << endl;
        de -= 1;
        if (de == 0)
        {
            if (root == nullptr)
                return;

            addNode(root, val);
            return;
        }
        // cout << "COPY::::" << de << " | " << root->val << endl;
        if (root->left != nullptr)
            solAdd(root->left, val, de);
        if (root->right != nullptr)
            solAdd(root->right, val, de);
    }

    TreeNode *addOneRow(TreeNode *root, int val, int depth)
    {
        TreeNode *dummy = new TreeNode(0);
        dummy->left = root;
        solAdd(dummy, val, depth);
        // cout << "DUMMY::::" << dummy->val << " @ " << dummy->left->val << endl;
        return dummy->left;
    }
};

// ###############################################

int main()
{

    return 0;
}