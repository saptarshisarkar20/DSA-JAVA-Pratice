# User function Template for python3
'''
    Given an array A containing 2*N+2 positive numbers, out of which 2*N numbers exist in pairs whereas the other two number occur exactly once and are distinct. Find the other two numbers. Return in increasing order.

    Example 1:

    Input: 
    N = 2
    arr[] = {1, 2, 3, 2, 1, 4}
    Output:
    3 4 
    Explanation:
    3 and 4 occur exactly once.
    Example 2:

    Input:
    N = 1
    arr[] = {2, 1, 3, 2}
    Output:
    1 3
    Explanation:
    1 3 occur exactly once.
    Your Task:
    You do not need to read or print anything. Your task is to complete the function singleNumber() which takes the array as input parameter and returns a list of two numbers which occur exactly once in the array. The list must be in ascending order.

    Expected Time Complexity: O(N)
    Expected Space Complexity: O(1)

    Constraints:
    1 <= length of array <= 106 
    1 <= Elements in array <= 5 * 106
'''


class Solution:
    def singleNumber(self, nums):
        nums.sort()
        n = len(nums)
        # print(nums)
        l = []
        i = 0
        while (i < n):
            # print(i, nums[i])
            if (i+1 < n):
                if (nums[i] != nums[i+1]):
                    l.append(nums[i])
                    i = i+1
                else:
                    i = i+2
            else:
                l.append(nums[i])
            if (len(l) == 2):
                l.sort()
                return l
        return l


# {
 # Driver Code Starts
# Initial Template for Python 3
if __name__ == '__main__':
    T = int(input())
    for i in range(T):
        n = int(input())
        v = list(map(int, input().split()))
        ob = Solution()
        ans = ob.singleNumber(v)
        for i in ans:
            print(i, end=" ")
        print()

# } Driver Code Ends
