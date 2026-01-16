from typing import List
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {}

        for i, num in enumerate(nums):
        
            remaining = target - num

            if remaining in seen:
                return [seen[remaining],i]
            seen[num] = i
        return [] 

        #Time complexity : O(n)
        #space Complexity : O(n)
        
        