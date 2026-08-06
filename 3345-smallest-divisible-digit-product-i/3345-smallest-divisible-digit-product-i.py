class Solution:
    def smallestNumber(self, n: int, t: int) -> int:
        digitprod=[0]*101
        def digitproduct(n):
            s=str(n)
            pro=1
            for i in s:
                pro*=int(i)
            return pro

        for i in range(1,101):
            digitprod[i]=digitproduct(i)
        for i in range(n,101):
            if digitprod[i] % t==0:
                return i
        return -1