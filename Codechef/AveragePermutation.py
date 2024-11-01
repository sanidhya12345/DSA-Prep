# cook your dish here
for _ in range(int(input())):
    n=int(input())
    a=[]
    for i in range(n):
        a.append(i+1)
    a[-2],a[-3],a[0]=a[-3],a[0],a[-2]
    if len(a)>=5:
        a[1],a[-4]=a[-4],a[1]
    print(*a)