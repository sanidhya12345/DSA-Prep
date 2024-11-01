def gray_code(n):
    result = []
    for i in range(1 << n):  # Loop from 0 to 2^n - 1
        gray = i ^ (i >> 1)  # Apply the Gray code formula
        result.append(f"{gray:0{n}b}")  # Convert to binary and pad with leading zeros
    return result

# Example usage for n = 3
n = int(input())
gray_codes = gray_code(n)
for code in gray_codes:
    print(code)