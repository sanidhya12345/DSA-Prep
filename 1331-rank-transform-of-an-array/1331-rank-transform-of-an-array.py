class Solution:
    def arrayRankTransform(self, arr: List[int]) -> List[int]:
        hmap=collections.defaultdict(int)
        l=arr.copy()
        l.sort()
        rank=1
        for i in l:
            if i not in hmap:
                hmap[i]=rank
                rank+=1
        result=[]
        for i in range(len(arr)):
            result.append(hmap[arr[i]])
        return result

