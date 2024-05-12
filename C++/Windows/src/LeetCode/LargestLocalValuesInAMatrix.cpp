#include <iostream>
#include <bits/stdc++.h>
#include <string>
#include <cmath>
using namespace std;

// ############################
/**
 * [[20,8,20,6,16,16,7,16,8,10],
 * [12,15,13,10,20,9,6,18,17,6],
 * [12,4,10,13,20,11,15,5,17,1],
 *  [7,10,14,14,16,5,1,7,3,11],
 *  [16,2,9,15,9,8,6,1,7,15],
 * [18,15,18,8,12,17,19,7,7,8]
 * ,[19,11,15,16,1,3,7,4,7,11],
 * [11,6,5,14,12,18,3,20,14,6],
 *  [4,4,19,6,17,12,8,8,18,8],
 * [19,15,14,11,11,13,12,6,16,19]]
 *
 */

class Solution
{
public:
    vector<vector<int>> largestLocal(vector<vector<int>> &grid)
    {
        vector<vector<int>> res;
        for (int i = 0; i < grid.size() - 2; i++)
        {
            vector<int> v;
            for (int j = 0; j < grid.size() - 2; j++)
            {
                int temp = grid[i][j];
                for (int x = i; x < i + 3; x++)
                {
                    for (int y = j; y < j + 3; y++)
                    {
                        temp = max(temp, grid[x][y]);
                        // cout<<i<<" | "<<j<<endl;
                    }
                }
                v.push_back(temp);
                // cout<<endl;
            }
            res.push_back(v);
        }
        return res;
    }
};

// ############################

int main()
{

    return 0;
}