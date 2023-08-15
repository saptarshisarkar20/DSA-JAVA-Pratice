#include <iostream>
#include <bits/stdc++.h>
#include <string>
#include <cmath>
using namespace std;

// ############################

int maxAreaContainer(vector<int> &height)
{
    // Write your code here.
    int ans = 0;
    int left = 0, right = height.size() - 1;
    while (left < right)
    {
        int temp = min(height[left], height[right]) * (right - left);
        ans = max(temp, ans);
        if (height[left] > height[right])
        {
            right--;
        }
        else
        {
            left++;
        }
    }
    return ans;
}

// ############################

int main()
{

    return 0;
}