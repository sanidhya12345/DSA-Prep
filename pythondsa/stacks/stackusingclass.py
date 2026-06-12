class Stack:
    def __init__(self):
        self.items=[]

    def push(self,item):
        self.items.append(item)

    def pop(self):
        if self.is_empty():
            return None
        return self.items.pop()
    
    def peek(self):
        if self.is_empty():
            return None
        return self.items[-1]
    
    def is_empty(self):
        return len(self.items)==0
    
    def size(self):
        return len(self.items)
    
    def display(self):
        print("Stack (top-> bottom)",self.items[::-1])



s=Stack()

s.push(10)
s.push(20)
s.push(30)

s.display()

print("Top element",s.peek())
print("Popped element",s.pop())
print("Size of the stack",s.size())
print("is stack empty",s.is_empty())