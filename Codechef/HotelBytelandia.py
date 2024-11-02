for _ in range(int(input())):
    n=int(input())
    arr=list(map(int,input().split(" ")))
    dep=list(map(int,input().split(" ")))
    arr.sort()
    dep.sort()
    i=0
    j=0
    curr_guests=0
    max_guests=0
    while i<n and j<n:
        if arr[i]<dep[j]:
            curr_guests+=1
            i+=1
        else:
            curr_guests-=1
            j+=1
        max_guests=max(curr_guests,max_guests)
    print(max_guests)