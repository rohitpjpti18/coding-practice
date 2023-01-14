from typing import List

class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        count1, maxElem1 = 0, -1
        count2, maxElem2 = 0, -1

        for i in nums:
            if maxElem1 == i:
                count1 += 1
            elif maxElem2 == i:
                count2 += 1
            elif count1 == 0:
                maxElem1 = i
                count1 += 1
            elif count2 == 0:
                maxElem2 = i
                count2 += 1
            else:
                count1 -= 1
                count2 -= 1

        result = []
        
        firstCount, secondCount = 0, 0

        for i in nums:
            if maxElem1 == i:
                firstCount+=1
            elif maxElem2 == i:
                secondCount +=1

        if firstCount > len(nums)/3:
            result.append(maxElem1)
        if secondCount > len(nums)/3:
            result.append(maxElem2)

        return result