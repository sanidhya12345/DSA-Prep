class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        stack=[]
        n=len(temperatures)
        result=[0]*n
        for i in range(0,n):
            while len(stack)!=0:
                if temperatures[stack[-1]]<temperatures[i]:
                    result[stack[-1]]=i-stack[-1]
                    stack.pop()
                else:
                    break
            stack.append(i)
        return result
        