class Solution:
    def minimumPushes(self, word: str) -> int:
           f=Counter(word)
           count=0
           pushes=1
           ans=0
           sorted_frequencies = [count for char, count in f.most_common()]
           for freq in sorted_frequencies:
                ans+=(freq*pushes)
                count+=1
                print(freq)
                if count==8:
                    count=0
                    pushes+=1
           return ans

            