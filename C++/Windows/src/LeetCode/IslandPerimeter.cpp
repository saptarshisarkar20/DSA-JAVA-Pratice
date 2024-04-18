#include <iostream>
#include <bits/stdc++.h>
#include <string>
#include <cmath>
using namespace std;

// ############################

class Solution
{
public:
    int ans;

    int calP(vector<vector<int>> &grid, int i, int j)
    {
        if (i < 0 || j < 0 || i == grid.size() || j == grid[0].size())
            return 0;

        if (grid[i][j] == 0)
            return 0;

        int temp = 0;
        if (i == 0)
            temp++;
        if (i == grid.size() - 1)
            temp++;
        if (j == 0)
            temp++;
        if (j == grid[0].size() - 1)
            temp++;
        if (i != 0 && grid[i - 1][j] == 0)
            temp++;
        if (j != 0 && grid[i][j - 1] == 0)
            temp++;
        if (i != grid.size() - 1 && grid[i + 1][j] == 0)
            temp++;
        if (j != grid[0].size() - 1 && grid[i][j + 1] == 0)
            temp++;
        return temp;
    }
    int islandPerimeter(vector<vector<int>> &grid)
    {
        ans = 0;
        for (int i = 0; i < grid.size(); i++)
        {
            for (int j = 0; j < grid[0].size(); j++)
            {
                ans += calP(grid, i, j);
            }
        }
        return ans;
    }
};

// ############################

int main()
{

    return 0;
}