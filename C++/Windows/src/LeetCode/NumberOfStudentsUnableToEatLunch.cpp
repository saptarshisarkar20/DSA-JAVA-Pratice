#include <iostream>
#include <bits/stdc++.h>
#include <string>
#include <cmath>
using namespace std;

// ############################
// APPROACH 1
class Solution
{
public:
    int countStudents(vector<int> &st, vector<int> &sd)
    {
        if (st.size() == 0)
            return 0;
        deque<int> dq;
        stack<int> stk;

        for (auto it : st)
        {
            dq.push_back(it);
        }

        for (int i = sd.size() - 1; i >= 0; i--)
        {
            stk.push(sd[i]);
        }

        int NotServed = 0;
        while (!stk.empty() && NotServed < dq.size())
        {
            if (stk.top() == dq.front())
            {
                stk.pop();
                dq.pop_front();
                NotServed = 0;
            }
            else
            {
                int temp = dq.front();
                dq.push_back(temp);
                dq.pop_front();
                NotServed++;
            }
        }

        return dq.size();
    }
};

// ############################
// APPROACH 2
// # OPTIMAL
class Solution
{
public:
    int countStudents(vector<int> &st, vector<int> &sd)
    {
        int st_cnt[] = {0, 0};
        for (auto it : st)
        {
            st_cnt[it]++;
        }

        for (int i = 0; i < sd.size(); i++)
        {
            int temp = sd[i];
            if (st_cnt[temp] > 0)
            {
                st_cnt[temp]--;
            }
            else
            {
                break;
            }
        }
        return st_cnt[0] + st_cnt[1];
    }
};

// ############################

int main()
{

    return 0;
}