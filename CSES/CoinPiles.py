def calc(a,b):
    return (a + b) % 3 == 0 and min(a, b) * 2 >= max(a, b)

for _ in range(int(input())):
    l=list(map(int,input().split(" ")))
    if calc(l[0],l[1]):
        print("YES")
    else:
        print("NO")
    