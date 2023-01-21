## https://www.codingninjas.com/codestudio/problems/920321

class Solution:
    def longestSubsetWithZeroSum(self, nums):
        hashMap = dict({})
        result = 0
        currentSum = 0

        for i in range(len(nums)):
            currentSum += nums[i]
            if currentSum == 0:
                result = i + 1 
            elif hashMap.get(currentSum) != None:
                result = max(result, i - hashMap[currentSum])
            else: 
                hashMap[currentSum] = i

        return result    