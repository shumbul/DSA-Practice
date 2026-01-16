class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        s = {}
        i = 0
        while i < len(nums):
            need = target - nums[i]
            if need in s:
                return s[need], i
            s[nums[i]] = i
            i+=1
// TC O(n)
// SC O(n)
                


        