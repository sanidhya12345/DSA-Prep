'''
GFG POTD-4/6/26
Substring with Max Zero-One Diff
Given a binary string s consisting of 0s and 1s. Find the maximum difference of the number of 0s and the number of 1s (number of 0s – number of 1s) in a substring of the string.

Note: In the case of all 1s, the answer will be -1.
'''

#PrefixSum-Approach O(N^2)
class Solution:
    def maxSubstring(self, s):
        n = len(s)
        
        pref = [[0] * 2 for _ in range(n)]
        if s[0] == '1':
            pref[0][1] = 1
        else:
            pref[0][0] = 1
            
        for i in range(1, n):
            if s[i] == '0':
                pref[i][0] = pref[i-1][0] + 1
                pref[i][1] = pref[i-1][1]
            else:
                pref[i][0] = pref[i-1][0]
                pref[i][1] = pref[i-1][1] + 1
                
        max_diff = float('-inf')
        
        for i in range(n):
            for j in range(i, n):
                
                if i == 0:
                    zeros = pref[j][0]
                    ones = pref[j][1]
                else:
                    zeros = pref[j][0] - pref[i-1][0]
                    ones = pref[j][1] - pref[i-1][1]
                    
                current_diff = zeros - ones
                
                if current_diff > max_diff:
                    max_diff = current_diff
                    
        return max_diff
    

#optimization using Kadanes' algo

def maxSubstring(self, s):
        max_so_far = float('-inf')
        current_sum = 0
        for char in s:
            val = 1 if char == '0' else -1
            current_sum += val
            if current_sum > max_so_far:
                max_so_far = current_sum
            if current_sum < 0:
                current_sum = 0
                
        return max_so_far