# Reverse Pairs | [Leetcode](https://leetcode.com/problems/reverse-pairs/)

&larr; [Back to Interview Preparation](../InterviewPreparation.md)

Given an integer array <code>nums</code>, return the number of **reverse pairs** in the array.

A **reverse pair** is a pair <code>(i, j)</code> where:

- <code>0 <= i < j < nums.length</code> and
- <code>nums[i] > 2 * nums[j]</code>.

**Example 1**

```
Input: nums = [1,3,2,3,1]
Output: 2
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 3, nums[4] = 1, 3 > 2 * 1
```
**Example 2**

```
Input: nums = [2,4,3,5,1]
Output: 3
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 4, nums[4] = 1, 4 > 2 * 1
(2, 4) --> nums[2] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 5, nums[4] = 1, 5 > 2 * 1
```

**Constraints:**

- <code>1 <= nums.length <= 5 * 10<sup>4</sup></code>
- <code>-2<sup>31</sup> <= nums[i] <= 2<sup>31</sup> - 1</code>


## PYTHON

```python
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
```

&larr; [Back to Interview Preparation](../InterviewPreparation.md)