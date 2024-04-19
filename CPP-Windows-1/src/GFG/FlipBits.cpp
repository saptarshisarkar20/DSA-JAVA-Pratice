//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution
{
public:
    int maxOnes(int a[], int n)
    {
        // Your code goes here
        int preSum = 0;
        int maxSum = 0;
        int currSum = 0;
        for (int i = 0; i < n; i++)
        {
            if (a[i] == 1)
                preSum++;
        }

        for (int i = 0; i < n; i++)
        {
            if (a[i] == 1)
                a[i] = -1;
            else
                a[i] = 1;
        }

        for (int i = 0; i < n; i++)
        {
            currSum += a[i];
            if (currSum < a[i])
                currSum = a[i];
            maxSum = max(maxSum, currSum);
        }
        return preSum + maxSum;
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
        int a[n + 5];
        for (int i = 0; i < n; i++)
            cin >> a[i];
        Solution ob;
        cout << ob.maxOnes(a, n) << endl;
    }
    return 0;
}

// } Driver Code Ends