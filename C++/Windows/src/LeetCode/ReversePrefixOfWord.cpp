#include <iostream>
#include <bits/stdc++.h>
#include <string>
#include <cmath>
using namespace std;

// ############################

class Solution
{
public:
    string reversePrefix(string word, char ch)
    {
        int temp = -1;
        for (int i = 0; i < word.length(); i++)
        {
            if (word[i] == ch)
            {
                temp = i;
                break;
            }
        }

        if (temp != -1)
        {
            int k = 0, j = temp;
            while (k < j)
            {
                swap(word[k], word[j]);
                k++;
                j--;
            }
        }
        return word;
    }
};
// ############################

int main()
{

    return 0;
}