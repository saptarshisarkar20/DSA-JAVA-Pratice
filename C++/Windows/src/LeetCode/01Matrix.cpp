#include <iostream>
#include <bits/stdc++.h>
#include <string>
#include <cmath>
using namespace std;

// ############################
class Solution
{
public:
    vector<vector<int>> updateMatrix(vector<vector<int>> &mat)
    {
        queue<pair<int, int>> q;
        for (int i = 0; i < mat.size(); i++)
        {
            for (int j = 0; j < mat[0].size(); j++)
            {
                if (mat[i][j] == 0)
                    q.push({i, j});
                else
                    mat[i][j] = -1;
            }
        }
        int length = 0;
        int dirx[] = {1, -1, 0, 0};
        int diry[] = {0, 0, 1, -1};
        while (!q.empty())
        {
            int size = q.size();
            length++;
            while (size--)
            {
                auto f = q.front();
                q.pop();
                int s = f.first;
                int end = f.second;
                for (int i = 0; i < 4; i++)
                {
                    int r = s + dirx[i];
                    int c = end + diry[i];
                    if (r < 0 || c < 0 || r == mat.size() || c == mat[0].size() || mat[r][c] != -1)
                        continue;
                    mat[r][c] = length;
                    q.push({r, c});
                }
            }
        }
        return mat;
    }
};
/* WRONG ANS
class Solution
{
public:
    int max_sz = INT_MAX;

    int getDist(vector<vector<int>> &mat, int r, int c, vector<vector<int>> &dp)
    {
        if (r < 0 || r >= mat.size() || c < 0 || c >= mat[0].size() || mat[r][c] == -2)
        {
            return max_sz;
        }
        cout << "ele -> " << mat[r][c] << " i,j " << r << " " << c << endl;

        if (dp[r][c] != -1)
            return dp[r][c];
        if (mat[r][c] == 0)
            return dp[r][c] = 0;

        mat[r][c] = -2;
        int a = max_sz, b = max_sz, cc = max_sz, d = max_sz;
        a = 1 + getDist(mat, r + 1, c, dp);
        cout << "a -> " << a << " i,j " << r << " " << c << "dp-> " << dp[r][c] << endl;

        b = 1 + getDist(mat, r, c + 1, dp);
        cout << "b -> " << b << " i,j " << r << " " << c << "dp-> " << dp[r][c] << endl;

        cc = 1 + getDist(mat, r - 1, c, dp);
        cout << "c -> " << c << " i,j " << r << " " << c << "dp-> " << dp[r][c] << endl;

        d = 1 + getDist(mat, r, c + 1, dp);
        cout << "d -> " << d << " i,j " << r << " " << c << "dp-> " << dp[r][c] << endl;

        mat[r][c] = 1;
        return dp[r][c] = min({a, b, cc, d});
    }

    vector<vector<int>> updateMatrix(vector<vector<int>> &mat)
    {
        int m = mat.size();
        int n = mat[0].size();
        max_sz = mat.size() + 999;
        vector<vector<int>> dp(m + 1, vector<int>(n + 1));
        vector<vector<int>> ans;

        for (int i = 0; i <= m; i++)
        {
            for (int j = 0; j <= n; j++)
            {
                dp[i][j] = -1;
            }
        }

        // for (int i = 0; i < m; i++)
        // {
        //     for (int j = 0; j < n; j++)
        //     {
        //         if (mat[i][j] == 1)
        //             mat[i][j] = max_sz;
        //     }
        // }

        for (int i = 0; i < m; i++)
        {
            vector<int> temp;

            for (int j = 0; j < n; j++)
            {
                if (mat[i][j] == 1)
                    temp.push_back(getDist(mat, i, j, dp));
                else
                    temp.push_back(0);
            }
            ans.push_back(temp);
        }
        return ans;
    }
};*/

/* WRONG ANS // TLE
class Solution
{
public:
    int fakeR = INT_MAX - 100;
    int findNearest(vector<vector<int>> &mat, int i, int j, int x, int y)
    {
        cout << "ele -> " << mat[i][j] << " i,j " << i << " " << j << endl;
        if (i >= x || j >= y || i < 0 || j < 0)
            return 100;

        if (mat[i][j] == 0)
            return 0;

        int a = 100, b = 100, c = 100, d = 100;
        if (i + 1 < x )
            a = 1 + findNearest(mat, i + 1, j, x, y);
        if (j + 1 < y)
            b = 1 + findNearest(mat, i, j + 1, x, y);
        if (i - 1 >= 0)
            c = 1 + findNearest(mat, i - 1, j, x, y);
        if (j - 1 >= 0)
            d = 1 + findNearest(mat, i, j - 1, x, y);

        return min({a, b, c, d});
        // return 99;
    }

    vector<vector<int>> updateMatrix(vector<vector<int>> &mat)
    {
        vector<vector<int>> ans;
        int x = mat.size();
        int y = mat[0].size();
        cout << mat.size() << " | " << mat[0].size() << endl;
        for (int i = 0; i < x; i++)
        {
            vector<int> temp;
            for (int j = 0; j < y; j++)
            {
                int t = findNearest(mat, i, j, x, y);
                // int t = 0;
                temp.push_back(t);
            }
            ans.push_back(temp);
        }
        return ans;
    }
};*/

// ############################

int main()
{
    vector<vector<int>> v = {{0, 1, 0, 1, 2}, {1, 1, 0, 0, 1}, {0, 0, 0, 1, 0}, {1, 0, 1, 1, 1}, {1, 0, 0, 0, 1}};
    Solution s;
    vector<vector<int>> res = s.updateMatrix(v);
    for (int i = 0; i < 5; i++)
    {
        for (int j = 0; j < 5; j++)
        {
            cout << res[i][j] << " | ";
        }
        cout << endl;
    }
    return 0;
}