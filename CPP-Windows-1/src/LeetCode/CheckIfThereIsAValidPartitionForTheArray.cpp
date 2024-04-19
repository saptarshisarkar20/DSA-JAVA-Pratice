#include <iostream>
#include <bits/stdc++.h>
#include <string>
#include <cmath>
using namespace std;

// ############################

class Solution
{
    int dp[100000 + 1];

public:
    bool solAns(vector<int> &nums, int ind)
    {
        int sz = nums.size();
        if (ind >= nums.size())
        {
            return true;
        }
        if (dp[ind] != -1)
            return dp[ind];

        bool res = false;

        if (ind + 1 < sz && nums[ind] == nums[ind + 1])
        {
            res = res || solAns(nums, ind + 2);
        }
        if (ind + 2 < sz && nums[ind] == nums[ind + 1] && nums[ind + 1] == nums[ind + 2])
        {
            res = res || solAns(nums, ind + 3);
        }
        if (ind + 2 < sz && nums[ind + 1] - nums[ind] == 1 && nums[ind + 2] - nums[ind + 1] == 1)
        {
            res = res || solAns(nums, ind + 3);
        }

        return dp[ind] = res;
    }

    bool validPartition(vector<int> &nums)
    {
        memset(dp, -1, sizeof(dp));
        return solAns(nums, 0);
    }
};

// ############################

int main()
{

    return 0;
}