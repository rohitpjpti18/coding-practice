from typing import List

class Solution:
    def __init__(self):
        self.__result = []
        self.__quad = []

    def runner(self, k: int, start: int, nums: List[int], target:int):
        if k < 2:
            return      ## Just in case

        if k != 2:
            for i in range(start, len(nums) - k + 1):
                if i > start and nums[i] == nums[i-1]:
                    continue
                self.__quad.append(nums[i])
                self.runner(k-1, i + 1, nums, target - nums[i])
                self.__quad.pop()
        else:
            end = len(nums) - 1
            while start < end:
                val = nums[start] + nums[end]
                if val == target:
                    self.__result.append(self.__quad + [nums[start], nums[end]])
                    start += 1
                    while start < end and nums[start] == nums[start-1]:
                        start += 1
                elif val > target:
                    end -= 1
                else:
                    start += 1
            
    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:
        nums.sort()
        self.runner(4, 0, nums, target)

        return self.__result
