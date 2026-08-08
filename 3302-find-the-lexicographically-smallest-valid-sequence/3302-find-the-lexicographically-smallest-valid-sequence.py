from typing import List
import bisect
from collections import defaultdict
class Solution:
    def validSequence(self, word1: str, word2: str) -> List[int]:
        n=len(word1)
        m=len(word2)

        # step1: we will find exact match of the characters
        # so for this we will finding the position where the suffix chars of the word2
        # fit in the word1

        #last_pos[j]==> will store the character in the word2 at index j where will it fit 
        #in the starting of the word1

        last_pos=[-1]*(m+1)

        last_pos[m]=n

        curr=n-1

        # using two pointers 
        for j in range(m-1,-1,-1):
            while curr>=0 and word1[curr]!=word2[j]:
                curr-=1
            if curr>=0:
                last_pos[j]=curr
                curr-=1
            else:
                last_pos[j]=-1

        # build pos dict to find the characters using binary search

        char_pos=defaultdict(list)

        for i,char in enumerate(word1):

            char_pos[char].append(i)

        # now we will use dp to check if one mismatch is allowed then the suffix of word2 at which position will fit in the last

        #latest_start1: latest start index in word1 for a match of word2[j...] with <= 1 mismatch

        latest_start1=[-1]*(m+1)
        latest_start1[m]=n

        for j in range(m-1,-1,-1):

            # choice1: Mistmatch at this character

            mismatch_val=-1

            if last_pos[j+1]!=-1:

                mismatch_val=last_pos[j+1]-1

            # choice2: Exact match this character

            exact_val=-1

            if latest_start1[j+1]!=-1:

                limit=latest_start1[j+1]

                pos_list=char_pos[word2[j]]

                idx=bisect.bisect_left(pos_list,limit)

                if idx>0:
                    exact_val=pos_list[idx-1]

            latest_start1[j]=max(mismatch_val,exact_val)

        # greedily left to right selection for the lexicographically smallest indices


        ans=[]

        i=0
        mismatches=1

        for j in range(m):

            limit_exact=latest_start1[j+1] if mismatches==1 else last_pos[j+1]
            limit_mismatch=last_pos[j+1] if mismatches==1 else -1

            picked=-1

            # first simply try the smallest possible next index 
            if i<n:

                if word1[i]==word2[j] and i+1<=limit_exact:

                    picked=i
                elif word1[i]!=word2[j] and i+1<=limit_mismatch:

                    picked=i

            if picked!=-1:

                ans.append(picked)

                if word1[picked]!=word2[j]:

                    mismatches-=1
                i=picked+1
            else:

                # if i is invalid, a mismatch is no longer possible

                # we must find the next exact match occurrences

                pos_list=char_pos[word2[j]]

                idx=bisect.bisect_left(pos_list,i)

                if idx<len(pos_list):

                    next_match=pos_list[idx]

                    if next_match+1<=limit_exact:

                        ans.append(next_match)
                        i=next_match+1
                    else:
                        return []
                else:
                    return []
        return ans
