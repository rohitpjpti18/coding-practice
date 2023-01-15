from typing import List


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        n = len(nums)

        start, end, result = 0, n-1, []
        while start < end:
            val = nums[start] + nums[end]
            if val == target:
                result.append(start+1)
                result.append(end+1)
                break
            elif val > target:
                end -= 1
            else:
                start += 1

        return result
                
