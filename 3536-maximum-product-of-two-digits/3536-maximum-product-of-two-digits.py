class Solution:
    def maxProduct(self, n: int) -> int:
        l=[]
        while n!=0:
            m=n%10
            l.append(m)
            n=n//10

        l.sort()

        return l[-1]*l[-2]    