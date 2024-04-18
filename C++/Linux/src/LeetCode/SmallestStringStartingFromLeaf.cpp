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

class Solution
{
public:
    vector<string> ans;
    char ltt[26] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    bool isLeaf(TreeNode *root)
    {
        return !root->left && !root->right;
    }

    void getAllString(TreeNode *root, string temp)
    {
        if (isLeaf(root))
        {

            temp = ltt[root->val] + temp;
            ans.push_back(temp);
            return;
        }
        temp = ltt[root->val] + temp;
        if (root->left)
            getAllString(root->left, temp);
        if (root->right)
            getAllString(root->right, temp);
    }

    string smallestFromLeaf(TreeNode *root)
    {
        getAllString(root, "");
        sort(ans.begin(), ans.end());
        ans.push_back("");
        return ans[0];
    }
};

// ###############################################

int main()
{

    return 0;
}