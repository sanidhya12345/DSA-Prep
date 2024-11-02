def apsum(p,q,n):
    return (n*(2*p+(n-1)*q))//2

def lastTerm(p,q,n):
    return p+(n-1)*q

for _ in range(int(input())):
    D,d,p,q=map(int,input().split(" "))
    rem=D%d #number of days which are not fully satisfied
    n=D//d # number of days which are fully satisfied
    sum=d*apsum(p,q,n)
    sum+=rem*lastTerm(p,q,n+1)
    print(sum)