//{ Driver Code Starts
// Initial template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function template for C++

class Solution
{
public:
    int missingNumber(vector<int> &array, int n)
    {
        // Your code goes here
        int addI = 0, baddIe = 0;
        for (int i = 1; i <= n; i++)
        {
            addI += i;
            if (i != n)
                baddIe += array[i - 1];
        }

        return addI - baddIe;
    }
};

//{ Driver Code Starts.

int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;

        vector<int> array(n - 1);
        for (int i = 0; i < n - 1; ++i)
            cin >> array[i];
        Solution obj;
        cout << obj.missingNumber(array, n) << "\n";
    }
    return 0;
}
// } Driver Code Ends