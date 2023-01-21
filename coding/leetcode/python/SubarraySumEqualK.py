## https://leetcode.com/problems/subarray-sum-equals-k/
from collections import defaultdict
from typing import List


class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        hashMap = dict()
        result, currentSum = 0, 0
        hashMap[currentSum] = 1

        for i in range(len(nums)):
            currentSum += nums[i]
            diff = currentSum - k
            result += hashMap.get(diff, 0) 
            hashMap[currentSum] = hashMap.get(currentSum, 0) + 1

        return result  