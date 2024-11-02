def lights(n):
    # Write your code here
    if n==1:
        return 1
    return (2**n-1)%100000

for _ in range(int(input())):
    n=int(input())
    print(lights(n))