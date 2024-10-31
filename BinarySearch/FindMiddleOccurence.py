def searchTarget(l,target):
    low=0
    high=len(l)-1
    ans=[-1,-1]
    while low<=high:
        mid=(low+high)//2
        if l[mid]==target:
            ans[0]=mid
            high=mid-1
        elif l[mid]>target:
            high=mid-1
        else:
            low=mid+1
    low=0
    high=len(l)-1
    while low<=high:
        mid=(low+high)//2
        if l[mid]==target:
            ans[1]=mid
            low=mid+1
        elif l[mid]<target:
            low=mid+1
        else:
            high=mid-1

    return ans           


l=list(map(int,input().split(" ")))
l.sort()
target=int(input())
ans=searchTarget(l,target)
print((ans[0]+ans[1])//2)
