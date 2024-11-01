l=[]
for _ in range(int(input())):
    s=input()
    l.append(s)

a="".join(map(str,l))
c=0
for i in range(0,len(a)):
    if i<len(a)-1:
        if a[i]==a[i+1]:
            c+=1
print(c+1)