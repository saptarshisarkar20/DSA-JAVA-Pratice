#include <iostream>
#include <bits/stdc++.h>
#include <string>
#include <cmath>
using namespace std;

// ############################

class Solution
{
public:
    string getRank(int i)
    {
        i = i + 1;
        if (i == 1)
        {
            return "Gold Medal";
        }
        if (i == 2)
        {
            return "Silver Medal";
        }
        if (i == 3)
        {
            return "Bronze Medal";
        }
        return to_string(i);
    }

    vector<string> findRelativeRanks(vector<int> &score)
    {
        vector<string> ans(score.size(), "");

        map<int, int> pos;
        for (int i = 0; i < score.size(); i++)
        {
            pos[score[i]] = i;
        }

        sort(score.begin(), score.end(), greater<int>());

        for (int i = 0; i < score.size(); i++)
        {
            ans[pos[score[i]]] = getRank(i);
        }
        return ans;
    }
};

// ############################

int main()
{

    return 0;
}