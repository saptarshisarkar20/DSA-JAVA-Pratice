//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution
{
public:
    // Function to find sum of all possible substrings of the given string.
    long long sumSubstrings(string s)
    {

        // your code here
        if (s.size() == 0)
            return 0;

        long long ans = 0;

        long long temp = 0;
        for (int j = 0; j < s.size(); j++)
        {
            temp = ((temp * 10) + (s[j] - '0') * (j + 1)) % 1000000007;
            ans = (ans + temp) % 1000000007;
        }

        return ans;
    }
};

//{ Driver Code Starts.
int main()
{
    // taking total testcases
    int t;
    cin >> t;
    while (t--)
    {
        // taking string
        string s;
        cin >> s;
        Solution ob;
        // calling sumSubstrings() function
        cout << ob.sumSubstrings(s) << endl;
    }
    return 0;
}

// } Driver Code Ends