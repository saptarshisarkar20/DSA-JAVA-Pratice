//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution
{
public:
    vector<string> ans;

    void getAllPermutation(string s, vector<bool> &vis, string temp)
    {
        if (temp.size() == s.size())
        {
            if (find(ans.begin(), ans.end(), temp) == ans.end())
                ans.push_back(temp);
            return;
        }
        for (int i = 0; i < s.size(); i++)
        {
            if (vis[i] == false)
            {
                vis[i] = true;
                temp.push_back(s[i]);
                getAllPermutation(s, vis, temp);
                vis[i] = false;
                temp.pop_back();
            }
        }
    }

    vector<string> find_permutation(string s)
    {
        // Code here there
        vector<bool> vis(s.size(), false);

        getAllPermutation(s, vis, "");
        sort(ans.begin(), ans.end());
        return ans;
    }
};

class Solution2
{
public:
    vector<string> ans;

    void getAllPermutation(string s, int ind)
    {
        if (ind == s.size())
        {
            if (find(ans.begin(), ans.end(), s) == ans.end())
                ans.push_back(s);
            return;
        }

        for (int i = ind + 1; i < s.size(); i++)
        {
            swap(s[ind], s[i]);
            getAllPermutation(s, ind + 1);
            swap(s[ind], s[i]);
        }
    }

    vector<string> find_permutation(string s)
    {
        // Code here there
        vector<bool> vis(s.size(), false);

        getAllPermutation(s, 0);
        sort(ans.begin(), ans.end());
        return ans;
    }
};

//{ Driver Code Starts.
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        string S;
        cin >> S;
        Solution ob;
        vector<string> ans = ob.find_permutation(S);
        sort(ans.begin(), ans.end());
        for (auto i : ans)
        {
            cout << i << " ";
        }
        cout << "\n";
    }
    return 0;
}

// } Driver Code Ends