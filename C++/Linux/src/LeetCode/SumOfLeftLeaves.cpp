#include <iostream>
#include <bits/stdc++.h>
#include <string>
#include <cmath>
using namespace std;

// ###############################################

//  Definition /for a binary tree node.
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
    int res;
    bool isLeaf(TreeNode *root)
    {
        return !root->left && !root->right;
    }

    void doSum(TreeNode *root)
    {
        if (!root)
            return;
        cout << "root \n";
        if (root->left && isLeaf(root->left))
        {
            cout << "root left\n";
            res += root->left->val;
        }

        doSum(root->left);
        doSum(root->right);
    }
    int sumOfLeftLeaves(TreeNode *root)
    {
        res = 0;
        doSum(root);
        return res;
    }
};

// ###############################################

int main()
{

    return 0;
}