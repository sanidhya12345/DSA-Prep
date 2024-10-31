import math

def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

def count_valid_triplets(arr):
    count_one = arr.count(1)  # Count the number of 1s
    count_primes = sum(1 for x in arr if is_prime(x))  # Count the primes

    # If there are fewer than 2 `1`s or no primes, no valid triplets can be formed
    if count_one < 2 or count_primes == 0:
        return 0

    # Calculate the number of ways to choose 2 `1`s and 1 prime
    triplet_count = (count_one * (count_one - 1) // 2) * count_primes
    return triplet_count

# Reading input
for _ in range(int(input())):
    n = int(input())
    arr = list(map(int, input().split()))
    print(count_valid_triplets(arr))
