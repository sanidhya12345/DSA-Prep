def gcd(a, b):
    while b != 0:
        a, b = b, a % b
    return a
def modular_expo(x, n, M):
    result = 1
    while n > 0:
        if n % 2 == 1:
            result = (result * x) % M
        x = (x * x) % M
        n = n // 2
    return result

n=int(input())
l=list(map(int,input().split(" ")))
g=l[0]
for i in range(1,n):
    g=gcd(g,l[i])

mul=1
for i in l:
    mul=mul*i
M=1000000007
print(modular_expo(mul,g,M))