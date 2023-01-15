from typing import List

class Solution:
    def __init__(self) -> None:
        self.__reverseCount: int = 0

    def merge(self, nums: List[int], start: int, mid: int, end: int):         
        x, y = start, mid+1
        y = mid + 1
        while x <= mid:
            while y <= end and nums[x] >  2*nums[y]:
                y += 1
            self.__reverseCount += y - (mid+1)
            x += 1
        
        i, j, k = start, mid+1, 0
        tempArr = []

        while k <=  end - start:
            if i <= mid and (j > end or nums[i] <= nums[j]):
                tempArr.append(nums[i])
                i += 1
            if j <= end and (i > mid or nums[i] > nums[j]):
                tempArr.append(nums[j])
                j += 1
            k += 1

        i = start
        for a in range(len(tempArr)):
            nums[i] = tempArr[a]
            i += 1         

    def mergeSort(self, nums: List[int], start: int, end: int):
        if start >= end:
            return

        mid = start + (end - start)//2
        self.mergeSort(nums, start, mid)
        self.mergeSort(nums, mid+1, end)
        self.merge(nums, start, mid, end)

    def reversePairs(self, nums: List[int]) -> int:
        self.mergeSort(nums, 0, len(nums)-1)
        return self.__reverseCount


if __name__ == '__main__':
    c = Solution()
    print(c.reversePairs([2,4,3,5,1]))
