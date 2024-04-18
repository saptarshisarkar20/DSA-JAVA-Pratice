#include <iostream>
#include <bits/stdc++.h>
#include <string>
#include <cmath>
using namespace std;

// ############################

class Solution
{
public:
    int maxFrequencyElements(vector<int> &nums)
    {
        map<int, int> mp;

        int ans = 0;
        int res = 0;
        for (int i = 0; i < nums.size(); i++)
        {
            mp[nums[i]]++;
            ans = max(ans, mp[nums[i]]);
        }

        for (int i = 0; i < nums.size(); i++)
        {
            if (mp[nums[i]] == ans)
                res++;
        }
        return res;
    }
};

// ############################

int main()
{

    return 0;
}