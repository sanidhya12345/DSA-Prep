def numberSpiral(y,x):
    max_val = max(y, x)  # Determine the layer by the maximum of y and x
    
    if max_val % 2 == 0:
        if y == max_val:
            # Even max_val, on the last row of the current layer
            return max_val * max_val - x + 1
        else:
            # Even max_val, on the last column of the current layer
            return (max_val - 1) * (max_val - 1) + y
    else:
        if x == max_val:
            # Odd max_val, on the last column of the current layer
            return max_val * max_val - y + 1
        else:
            # Odd max_val, on the last row of the current layer
            return (max_val - 1) * (max_val - 1) + x


for _ in range(int(input())):
    y,x=map(int,input().split(" "))
    print(numberSpiral(y,x))