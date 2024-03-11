#include <iostream>
#include <bits/stdc++.h>
#include <string>
#include <cmath>
using namespace std;

// ############################

string longestCommonPrefix(vector<string> &strs)
{
    int smSize = INT_MAX;

    for (int i = 0; i < strs.size(); i++)
    {
        if (smSize > strs[i].length())
        {
            smSize = strs[i].length();
        }
    }
    string ans = "";

    for (int i = 0; i < smSize; i++)
    {
        char temp = strs[0][i];
        for (int j = 1; j < strs.size(); j++)
        {
            if (temp != strs[j][i])
                return ans;
        }
        ans += temp;
    }

    return ans;
}

// ############################

int main()
{

    return 0;
}