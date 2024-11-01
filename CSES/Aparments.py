def apartments(apli, apar, n, m, k):
    apli.sort()
    apar.sort()
    i = 0
    j = 0
    matches = 0  # Renamed to avoid conflict with the input variable 'm'
    
    while i < n and j < m:
        if abs(apli[i] - apar[j]) <= k:
            matches += 1
            i += 1
            j += 1
        elif apar[j] < apli[i] - k:
            j += 1
        else:
            i += 1
    
    print(matches)

# Input handling
n, m, k = map(int, input().split())
apli = list(map(int, input().split()))
apar = list(map(int, input().split()))

# Function call
apartments(apli, apar, n, m, k)
