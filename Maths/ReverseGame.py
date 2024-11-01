def rotate_array_right(arr, d):
    n = len(arr)
    d = d % n  # Handle cases where d > n
    reverse(arr, 0, n - d)
    reverse(arr, n - d, n)
    reverse(arr, 0, n)

def reverse(arr, start, end):
    end -= 1  # Adjust to get the correct last index
    while start < end:
        arr[start], arr[end] = arr[end], arr[start]
        start += 1
        end -= 1

for _ in range(int(input())):
    n,k=map(int,input().split(" "))
    l=[i for i in range(0,n)]
    l.sort(reverse=True)
    rotate_array_right(l,n-k)
    print(l)