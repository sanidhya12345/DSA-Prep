class Solution:
    def minimumPushes(self, word: str) -> int:
        n=len(word)
        if n<=8:
            return n

        ans=0
        push=1
        for i in range(0,n,8):
            ans+=(len(word[i:i+8])*push)
            push+=1

        return ans