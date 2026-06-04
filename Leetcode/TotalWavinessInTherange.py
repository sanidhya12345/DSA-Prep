'''
Leetcode 3751
@sanidhya12345
'''

#bruteforce approach
def waviness(n):
  s=str(n)
  wav=0
  for i in range(1,len(s)-1):
    if (int(s[i])>int(s[i-1]) and int(s[i])>int(s[i+1])) or (int(s[i])<int(s[i-1]) and int(s[i])<int(s[i+1])):
       wav+=1
  return wav
       
n=4848
print(waviness(n))


#dynamic programming

class Solution:
    maxi=100005
    dp=[0]*maxi
    pref=[0]*maxi
    for i in range(100,maxi):
        d1=i%10
        d2=(i//10)%10
        d3=(i//100)%10

        wave=int(d2>max(d3,d1) or d2 < min(d3,d1))
        dp[i]=dp[i//10]+wave
        pref[i]=pref[i-1]+dp[i]
    def totalWaviness(self, num1: int, num2: int) -> int:
        return self.pref[num2]-self.pref[num1-1]