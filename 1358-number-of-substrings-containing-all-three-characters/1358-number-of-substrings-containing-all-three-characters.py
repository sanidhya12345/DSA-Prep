class Solution:
    def numberOfSubstrings(self, s: str) -> int:
        map={'a':0,'b':0,'c':0}
        res=0
        i=0
        for j in range(len(s)):
            map[s[j]]+=1

            while map['a']>0 and map['b']>0 and map['c']>0:
                map[s[i]]-=1
                i+=1
            res+=i
        return res
        