import math
from collections import Counter

class Solution:
    def smallestPalindrome(self, s: str, k: int) -> str:
        counts = Counter(s)
        half_length = 0
        odd_char = ""
        half_counts = {}
        
        for char, freq in counts.items():
            if freq % 2 != 0:
                odd_char = char
            half_counts[char] = freq // 2
            half_length += half_counts[char]
            
        # Calculate initial total permutations ONCE
        def get_initial_perm(total_len, char_counts):
            res = math.factorial(total_len)
            for count in char_counts.values():
                if count > 1:
                    res //= math.factorial(count)
            return res
            
        current_perms = get_initial_perm(half_length, half_counts)
        
        # Check if k is greater than total possible permutations
        if k > current_perms:
            return ""
            
        first_half = []
        available_chars = sorted(half_counts.keys())
        remaining_len = half_length
        
        while remaining_len > 0:
            for char in available_chars:
                count = half_counts[char]
                if count > 0:
                    # O(1) calculation instead of doing factorials again
                    perms_if_chosen = current_perms * count // remaining_len
                    
                    if k <= perms_if_chosen:
                        # Answer lies in this branch
                        first_half.append(char)
                        half_counts[char] -= 1
                        remaining_len -= 1
                        current_perms = perms_if_chosen # Update permutations for next level
                        break
                    else:
                        # Skip this branch
                        k -= perms_if_chosen

        first_half_str = "".join(first_half)
        return first_half_str + odd_char + first_half_str[::-1]