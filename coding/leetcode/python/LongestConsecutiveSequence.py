## 128. Longest Consecutive Sequence
from typing import List


class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        hashSet = set({})
        result = 0

        for i in nums:
            hashSet.add(i)

        for i in nums:
            if i-1 not in hashSet:
                count = 0
                tempVal:int = i
                while tempVal in hashSet:
                    count += 1
                    tempVal += 1
                result = max(result, count)
        
        return result
