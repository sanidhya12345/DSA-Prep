for _ in range(int(input())):
    n,k=map(int,input().split())
    points=list(map(int,input().split()))
    m=[points[i] for i in range(0,n) if i%2==0]
    t=[points[i] for i in range(0,n) if i%2!=0]
    i=0
    while i<k:
        a=max(m)
        b=min(t)
        m.remove(a)
        t.append(a)
        t.remove(b)
        m.append(b)
        i+=1
    if sum(m)<sum(t):
        print("YES")
    else:
        print("NO")