#  4Sum | [Leetcode](https://leetcode.com/problems/4sum/)

&larr; [Back to Interview Preparation](../InterviewPreparation.md)

Given an array `nums` of `n` integers, return an array of all the **unique** quadruplets `[nums[a], nums[b], nums[c], nums[d]]` such that:

- `0 <= a, b, c, d < n`
- `a`, `b`, `c`, and `d` are **distinct**.
- `nums[a] + nums[b] + nums[c] + nums[d] == target`

You may return the answer in **any order**.

**Example 1**
```
Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
```
**Example 2**

```
Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]
```

**Constraints:**

- <code>1 <= nums.length <= 200</code>
- <code>10<sup>9</sup> <= nums[i] <= 10<sup>9</sup></code>
- <code>10<sup>9</sup> <= target <= 10<sup>9</sup></code>


## PYTHON

```python
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
```

&larr; [Back to Interview Preparation](../InterviewPreparation.md)