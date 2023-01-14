from typing import List


class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        count, maxElem = 0, nums[0]

        for i in nums:
            if count == 0:
                maxElem = i
                count += 1
                continue

            if maxElem == i:
                count += 1
            else:
                count -= 1

        return maxElem       
        