# Majority Element II | [Leetcode](https://leetcode.com/problems/majority-element-ii/)


&larr; [Back to Interview Preparation](../InterviewPreparation.md)

Given an integer array of size <code>n</code>, find all elements that appear more than <code>⌊ n/3 ⌋</code> times.

**Example 1**

```
Input: nums = [3,2,3]
Output: [3]
```
**Example 2**

```
Input: nums = [1]
Output: [1]
```
**Example 3**

```
Input: nums = [1,2]
Output: [1,2]
```


**Constraints:**

- <code>1 <= nums.length <= 5 * 10<sup>4</sup></code>
- <code>-10<sup>9</sup> <= nums[i] <= 10<sup>9</sup></code>

## JAVA

**To be implemented**

## PYTHON

```python
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
```

&larr; [Back to Interview Preparation](../InterviewPreparation.md)
