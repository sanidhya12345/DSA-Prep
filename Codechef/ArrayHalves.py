# cook your dish here

for _ in range(int(input())):
    n = int(input())
    array = list(map(int, input().split()))
    min_swap,j = 0,0
    for i in range(2*n):
        if array[i] <= n:
            min_swap += (i-j)
            j += 1 
    print(min_swap)