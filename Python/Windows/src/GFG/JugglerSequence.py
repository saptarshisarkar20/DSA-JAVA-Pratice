# User function Template for python3

class Solution:

    def calculate12(self, n):
        return n**0.5

    def calculate32(self, n):
        return n * self.calculate12(n)

    def jugglerSequence(self, n):
        # code here
        l = []
        l.append(n)
        while (n != 1):
            if n % 2 == 1:
                n = calculate32(n)
            else:
                n = calculate12(n)
            l.append(n)
        return l

        # {
     # Driver Code Starts
        # Initial Template for Python 3
if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        n = int(input())

        ob = Solution()
        arr = ob.jugglerSequence(n)
        for i in (arr):
            print(i, end=" ")
        print()

# } Driver Code Ends
