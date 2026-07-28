class Solution:
    def smallestPalindrome(self, s: str) -> str:
        freq = {chr(i): 0 for i in range(97, 123)}

        if len(s) <= 1:
            return s
        
        for i in s:
            freq[i] += 1

        firsthalf = ""
        for i in freq.keys():
            if freq[i] and freq[i] % 2 != 0:
                firsthalf += i * (freq[i] // 2)
                freq[i] = freq[i] - (freq[i] // 2)
                
            elif freq[i] and freq[i] % 2 == 0:
                firsthalf += i * (freq[i] // 2)
                freq[i] = freq[i] // 2 

        secondhalf = firsthalf[::-1]
        for i in secondhalf:
            freq[i] = freq[i] - 1
        middle = ""
        for i in freq.keys():
            if freq[i] > 0:
                middle += i * freq[i]

        return firsthalf + middle + secondhalf