n=int(input())
s1=set([i+1 for i in range(0,n)])
p=list(map(int,input().split(" ")))
q=list(map(int,input().split(" ")))

lx,ly=p[1:],q[1:]

s=set(lx)
s2=s.union(ly)

if s1.intersection(s2)==s2 and s1.intersection(s2)==s1:
    print("I become the guy.")
else:
    print("Oh, my keyboard!")