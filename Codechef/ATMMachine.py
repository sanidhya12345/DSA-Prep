for _ in range(int(input())):
    l,price=map(int,input().split(" "))
    acc=list(map(int,input().split(" ")))
    s=""
    for i in acc:
        if i<=price:
            s+="1"
            price-=i
        else:
            s+="0"
    print(s)