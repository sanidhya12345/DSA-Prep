class Solution:
    def numOfStrings(self, patterns: List[str], word: str) -> int:
        poss_subs=[]
        for i in range(0,len(word)):
            for j in range(i,len(word)):
                poss_subs.append(word[i:j+1])
        count=0
        for i in patterns:
            if i in poss_subs:
                count+=1
        return count