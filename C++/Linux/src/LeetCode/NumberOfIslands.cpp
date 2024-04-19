#include <iostream>
#include <bits/stdc++.h>
#include <string>
#include <cmath>
using namespace std;

// ###############################################

class Solution
{
public:
    void checkLand(vector<vector<char>> &grid, int i, int j)
    {
        if (i < 0 || j < 0 || i == grid.size() || j == grid[0].size() || grid[i][j] == '0')
            return;
        if (grid[i][j] == '1')
        {
            grid[i][j] = '2';
            checkLand(grid, i + 1, j);
            checkLand(grid, i, j + 1);
            checkLand(grid, i - 1, j);
            checkLand(grid, i, j - 1);
        }
    }
    int numIslands(vector<vector<char>> &grid)
    {
        int ans = 0;
        for (int i = 0; i < grid.size(); i++)
        {
            for (int j = 0; j < grid[0].size(); j++)
            {
                if (grid[i][j] == '1')
                {
                    ans++;
                    checkLand(grid, i, j);
                }
            }
        }
        return ans;
    }
};

// ###############################################

int main()
{

    return 0;
}