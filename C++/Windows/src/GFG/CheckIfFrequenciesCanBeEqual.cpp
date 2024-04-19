//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function template for C++
class Solution
{
public:
    bool sameFreq(string s)
    {
        // code here
        unordered_map<char, int> freq; // map to store frequency

        for (auto i : s) // iterate the s string and increment the count of frequency
            freq[i]++;

        int maxCount = 0, minCount = 0;
        int maxi = INT_MIN, mini = INT_MAX;

        // get the maximum and minimum freqency
        for (auto i : freq)
        {
            maxi = max(maxi, i.second);
            mini = min(mini, i.second);
        }

        // get the count of the maximum and minimum freqency
        for (auto i : freq)
        {
            if (i.second == maxi)
                maxCount++;
            if (i.second == mini)
                minCount++;
        }

        // 1. maxi == mini ie same char so we dont need to delete any char

        // 2. mini = maxi - 1 -> we can only delete when the frequency gap is of one &&
        //    the only maximum character is one otherwise there would be some character left
        if (maxi == mini or (mini == maxi - 1 and maxCount == 1))
            return true;

        // edge case
        // where xxyyz -> max count repeating and min count only 1
        // addition of both count should be the size of the map
        if (mini == 1 and minCount == 1 and maxCount + minCount == freq.size())
            return true;

        return false;
    }
};

//{ Driver Code Starts.
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        string s;
        cin >> s;
        Solution ob;
        cout << ob.sameFreq(s) << endl;
    }
}

// } Driver Code Ends