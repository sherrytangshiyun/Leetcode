 class Solution:
      def twoSum(self, nums: List[int], target: int) -> List[int]:
           for n, num in enumerate(nums):
               if (target - num) in nums:
                     if nums.index(target - num) != n:
                         return [n, nums.index(target - num)]