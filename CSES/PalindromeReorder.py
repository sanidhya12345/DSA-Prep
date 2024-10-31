s=input()
map=dict()
for i in range(0,len(s)):
    if s[i] not in map.keys():
      map[s[i]]=1
    else:
       map[s[i]]=map[s[i]]+1

l=[i for i in map.values() if i%2!=0]
pat1=""
pat2=""
char=""
if len(l)>1:
   print("NO SOLUTION")
else:
   for i in map.keys():
      if map[i]%2==0:
         pat1=pat1+i*(map[i]//2)
         pat2=i*(map[i]//2)+pat2
         map[i]=map[i]-(map[i]//2)
      else:
         char=char+i*map[i]
print(pat2+char+pat1)