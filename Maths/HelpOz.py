import math
from functools import reduce

# Function to compute GCD of two numbers
def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

# Function to find all divisors of a number
def find_divisors(n):
    divisors = []
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            divisors.append(i)
            if i != n // i:
                divisors.append(n // i)
    divisors.append(n)  # Include n itself
    divisors.sort()
    return divisors

# Function to find the largest subsequence
def largest_subsequence(n, lst):
    diffs = [abs(lst[i] - lst[i - 1]) for i in range(1, n)]
    common_gcd = reduce(gcd, diffs)
    return find_divisors(common_gcd)

# Reading input
n = int(input())
lst = [int(input()) for _ in range(n)]

# Finding and printing results
result = largest_subsequence(n, lst)
print(' '.join(map(str, result)))
