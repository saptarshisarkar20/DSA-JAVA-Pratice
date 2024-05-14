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

    void colGol(int r, int c, int m, int n, vector<vector<int>> &g,
                vector<vector<bool>> &vis, int temp)
    {

        if (r < 0 || r >= m || c < 0 || c >= n || g[r][c] == 0 || !vis[r][c])
        {
            ans = max(ans, temp);
        }
        else
        {
            vis[r][c] = false;
            temp += g[r][c];
            // if (vis[r + 1][c])
            colGol(r + 1, c, m, n, g, vis, temp);
            // if (vis[r - 1][c])
            colGol(r - 1, c, m, n, g, vis, temp);
            // if (vis[r][c + 1])
            colGol(r, c + 1, m, n, g, vis, temp);
            // if (vis[r][c - 1])
            colGol(r, c - 1, m, n, g, vis, temp);
            temp -= g[r][c];
            vis[r][c] = true;
        }
    }

    int getMaximumGold(vector<vector<int>> &grid)
    {
        ans = 0;
        int m = grid.size();
        int n = grid[0].size();
        vector<vector<bool>> vis(m, vector<bool>(n, true));
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (vis[i][j] && grid[i][j] != 0)
                    colGol(i, j, m, n, grid, vis, 0);
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