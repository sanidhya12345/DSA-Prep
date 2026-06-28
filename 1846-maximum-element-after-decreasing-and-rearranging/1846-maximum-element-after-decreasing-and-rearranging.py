class Solution:
    def checkTwoAdjacent(self,arr,i,j):
        return abs(arr[i]-arr[j])<=1
    def maximumElementAfterDecrementingAndRearranging(self, arr: List[int]) -> int:
        arr.sort()
        if arr[0]!=1:
            arr[0]=1
        if len(arr)==1:
            return 1
        for i in range(0,len(arr)-1):
            if not self.checkTwoAdjacent(arr,i,i+1):
                arr[i+1]=arr[i]+1
        return max(arr)
        