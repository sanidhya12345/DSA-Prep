class Solution:
    def smallestNumber(self, num: str, t: int) -> str:
        # Step 1: Check if 't' can be formed by multiplying digits (1 to 9).
        # Digits from 1 to 9 only have prime factors 2, 3, 5, and 7.
        temp = t
        for p in [2, 3, 5, 7]:
            while temp % p == 0:
                temp //= p
        # If there's any other prime factor left (like 11, 13, etc.), it's impossible.
        if temp > 1:
            return "-1"
            
        # DP memoization to find the exact minimum number of digits needed
        # such that their product is a multiple of 'rem'.
        memo = {}
        def min_digits(rem: int) -> int:
            if rem == 1:
                return 0
            if rem in memo:
                return memo[rem]
            
            ans = float('inf')
            # We can use digits 2 to 9 to reduce the remainder
            # (1 doesn't reduce the remainder, so we skip it to prevent infinite recursion)
            for d in range(2, 10):
                gcd_val = math.gcd(rem, d)
                if gcd_val > 1:
                    ans = min(ans, 1 + min_digits(rem // gcd_val))
            
            memo[rem] = ans
            return ans
            
        # Step 2: Make `num` zero-free
        # If there is a '0', change the first '0' to '1' and all subsequent digits to '1'.
        # This guarantees we start with the smallest valid zero-free string >= original num.
        if '0' in num:
            idx = num.index('0')
            num = num[:idx] + '1' * (len(num) - idx)
            
        # Step 3: Check if the current `num` already satisfies the condition
        # We also keep an array `rem_array` where `rem_array[i]` represents the 
        # remaining 't' after processing the first 'i' digits.
        rem_array = [t]
        for d in num:
            rem_array.append(rem_array[-1] // math.gcd(rem_array[-1], int(d)))
            
        if rem_array[-1] == 1:
            return num
            
        # Step 4: Backtracking from right to left to find the smallest valid number of the same length
        n = len(num)
        for i in range(n - 1, -1, -1):
            prefix_rem = rem_array[i]
            rem_length = n - 1 - i
            
            # Try to increment the current digit num[i] (must be strictly greater)
            for d in range(int(num[i]) + 1, 10):
                new_rem = prefix_rem // math.gcd(prefix_rem, d)
                
                # Check if we can satisfy the remaining product requirement with the available empty spots
                if min_digits(new_rem) <= rem_length:
                    # If we can, build the smallest suffix greedily
                    ans = list(num[:i])
                    ans.append(str(d))
                    
                    curr_rem = new_rem
                    for j in range(rem_length):
                        # Find the smallest valid digit to place at this empty position
                        for next_d in range(1, 10):
                            next_rem_cand = curr_rem // math.gcd(curr_rem, next_d)
                            # Can the remaining suffix still fulfill this candidate remainder?
                            if min_digits(next_rem_cand) <= rem_length - 1 - j:
                                ans.append(str(next_d))
                                curr_rem = next_rem_cand
                                break
                    return "".join(ans)
                    
        # Step 5: If no valid combination of the same length works, we must increase the string length.
        # The new length will be the maximum of (current length + 1) and the minimum digits required for 't'.
        new_len = max(len(num) + 1, min_digits(t))
        ans = []
        curr_rem = t
        
        # Greedily build the new valid string from left to right
        for j in range(new_len):
            for d in range(1, 10):
                next_rem_cand = curr_rem // math.gcd(curr_rem, d)
                if min_digits(next_rem_cand) <= new_len - 1 - j:
                    ans.append(str(d))
                    curr_rem = next_rem_cand
                    break
                    
        return "".join(ans)