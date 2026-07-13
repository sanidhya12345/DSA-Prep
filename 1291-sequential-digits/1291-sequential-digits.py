class Solution:
    def sequentialDigits(self, low: int, high: int) -> List[int]:
        
        # l is an array of lists where the index represents the length of the number.
        # For example, l[3] will hold all 3-digit sequential numbers: [123, 234, 345...]
        # We use size 11 because constraints say high <= 10^9 (which is 10 digits).
        l = []
        for _ in range(11):
            l.append([])
        
        # --- STEP 1: Find the smallest possible sequential number for each length ---
        # For length 2, it's 12. For length 3, it's 123. For length 4, it's 1234, etc.
        digit = 3
        for i in range(11):
            if i == 2:
                # Base case: The smallest 2-digit sequential number is 12
                l[2].append(12)
            elif i > 2:
                # Build the next smallest number by taking the previous one, 
                # multiplying by 10, and adding the next digit.
                # Example: for i=3, l[2][0] is 12. 12 * 10 + 3 = 123.
                num = l[i-1][0] * 10 + digit
                l[i].append(num)
                digit += 1
        
        # --- STEP 2: Generate all other sequential numbers using the "gap" ---
        # The difference between consecutive sequential numbers of the same length 
        # is always a number made entirely of 1s (e.g., 234 - 123 = 111, 345 - 234 = 111).
        for i in range(11):
            if i >= 2:
                start = l[i][0]  # The smallest number of length i (e.g., 123 for length 3)
                
                # Create the gap. For length 3, len(str(123)) is 3, so gap = int('111') = 111.
                gap = int('1' * len(str(start))) 
                num = start + gap

                # Keep adding the gap until the number gets too long (e.g., 89 + 11 = 100)
                # or until the last digit hits 0 (e.g., 89 becomes 100, last digit is '0')
                while len(str(num)) == i and str(num)[-1] != '0':
                    l[i].append(num)
                    num = num + gap
        
        # --- STEP 3: Filter by length bounds ---
        # Find the number of digits in the 'low' and 'high' boundaries.
        sdl = len(str(low))
        edl = len(str(high))

        combined = []
        # Combine all pre-calculated sequential numbers that have a valid number of digits
        for i in range(sdl, edl + 1):
            combined += l[i]
        
        # --- STEP 4: Filter by actual numerical bounds ---
        result = []
        # From our length-filtered list, only keep the numbers strictly inside [low, high]
        for i in combined:
            if i >= low and i <= high:
                result.append(i)
                
        return result