class Solution:
    def maximumProduct(self, nums: List[int]) -> int:

        nums.sort()

        maxi=nums[-1]
        second_max=nums[-2]
        third_max=nums[-3]

        mini=nums[0]
        second_min=nums[1]

        return max(maxi*second_max*third_max,maxi*mini*second_min)