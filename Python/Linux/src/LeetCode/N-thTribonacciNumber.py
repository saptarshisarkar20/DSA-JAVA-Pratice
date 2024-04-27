class Solution:
    def tribonacci(self, n: int) -> int:
        first_num = [0, 1, 1]
        if(n<3):
            return first_num[n]
        t1 = 0
        t2 = 1
        t3 = 1
        for i in range(0, n-2):
            temp = t1+t2+t3
            t1 = t2
            t2 = t3
            t3 = temp
        return t3
            