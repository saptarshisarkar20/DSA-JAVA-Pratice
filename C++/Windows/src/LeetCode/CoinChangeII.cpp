#include <iostream>
#include <bits/stdc++.h>
#include <string>
#include <cmath>
using namespace std;

// ############################

class Solution
{
public:
    // amount -> W
    // coins -> val[]
    // coins -> wt[]

    int dp[5005][303];
    int solve(int W, vector<int> &wt, vector<int> &val, int n)
    {
        if (W == 0)
        {
            return 1;
        }
        if (n <= 0)
            return 0;
        if (dp[W][n] != -1)
        {
            return dp[W][n];
        }
        if (W < wt[n - 1])
        {
            return dp[W][n] = solve(W, wt, val, n - 1);
        }
        return dp[W][n] = solve(W, wt, val, n - 1) + solve(W - wt[n - 1], wt, val, n);
    }

    int change(int amount, vector<int> &coins)
    {
        vector<int> wt = coins;
        memset(dp, -1, sizeof(dp));
        // return cc2(amount, wt, coins, coins.size());
        return solve(amount, wt, coins, coins.size());
    }
};

// ############################

int main()
{

    return 0;
}