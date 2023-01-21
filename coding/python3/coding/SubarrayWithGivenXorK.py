

class Solution:
    def subarraysXor(nums, x):
        hashMap = dict()
        result, currentXor = 0, 0

        for i in nums:
            currentXor = currentXor ^ i
            diffXor = currentXor^x
            result += hashMap.get(diffXor, 0)
            if currentXor == x:
                result += 1
            hashMap[currentXor] = hashMap.get(currentXor, 0) + 1
        
        return result



        