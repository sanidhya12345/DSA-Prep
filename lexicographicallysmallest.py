class Solution:
    def lexicographicallySmallest(self, s: str, k: int) -> str:
        n = len(s)
        
        def poweroftwo(num):
            return num > 0 and (num & (num - 1)) == 0
       
        if poweroftwo(n):
            k = k // 2
        else:
            k = k * 2
        
        if k >= n:
            return "-1"
            
        stack = []
        for char in s:
          
            while stack and k > 0 and stack[-1] > char:
                stack.pop()
                k -= 1
            stack.append(char)
            
      
        if k > 0:
            stack = stack[:-k]
            
        result = "".join(stack)
        
        return result if result else "-1"
