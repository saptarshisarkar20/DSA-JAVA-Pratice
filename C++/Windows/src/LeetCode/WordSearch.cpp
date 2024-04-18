#include <iostream>
#include <bits/stdc++.h>
#include <string>
#include <cmath>
using namespace std;

// ############################

class Solution
{
public:
    bool ans;

    void find_word(int i, int j, int m, int n, vector<vector<char>> &board, string word, vector<vector<bool>> &vis, string temp)
    {
        if (i < 0 || i == m || j < 0 || j == n || vis[i][j])
            return;

        if (board[i][j] != word[temp.length()])
            return;

        temp += board[i][j];

        if (temp == word)
        {
            ans = true;
            return;
        }

        vis[i][j] = true;

        find_word(i + 1, j, m, n, board, word, vis, temp);
        find_word(i, j + 1, m, n, board, word, vis, temp);
        find_word(i - 1, j, m, n, board, word, vis, temp);
        find_word(i, j - 1, m, n, board, word, vis, temp);

        vis[i][j] = false;
    }

    bool exist(vector<vector<char>> &board, string word)
    {
        ans = false;
        int m = board.size();
        int n = board[0].size();
        vector<vector<bool>> vis(m, vector<bool>(n, false));

        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                find_word(i, j, m, n, board, word, vis, "");
                if (ans)
                    return true;
            }
        }
        return false;
    }
};

// ############################

class Solution2
{
public:
    bool find_word(int i, int j, int m, int n, vector<vector<char>> &board, string word, vector<vector<bool>> &vis, string temp)
    {
        if (i < 0 || i == m || j < 0 || j == n || vis[i][j])
            return false;

        if (board[i][j] != word[temp.length()])
            return false;

        temp += board[i][j];

        if (temp == word)
        {
            return true;
        }

        vis[i][j] = true;

        bool rtv = find_word(i + 1, j, m, n, board, word, vis, temp) ||
                   find_word(i, j + 1, m, n, board, word, vis, temp) ||
                   find_word(i - 1, j, m, n, board, word, vis, temp) ||
                   find_word(i, j - 1, m, n, board, word, vis, temp);

        vis[i][j] = false;
        return rtv;
    }

    bool exist(vector<vector<char>> &board, string word)
    {
        int m = board.size();
        int n = board[0].size();
        vector<vector<bool>> vis(m, vector<bool>(n, false));

        if (m * n < board.size())
            return false;

        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (find_word(i, j, m, n, board, word, vis, ""))
                    return true;
            }
        }
        return false;
    }
};

// ############################

int main()
{

    return 0;
}