stack=[]
stack.append("a")
stack.append("b")
stack.append("c")

print(stack)
print("Top item",stack[-1])

item=stack.pop()
print("Popped",item)
print(stack)

print(len(stack)==0)