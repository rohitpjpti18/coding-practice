# Find the Duplicate Number | [Leetcode](https://leetcode.com/problems/find-the-duplicate-number/)

&larr; [Back to Interview Preparation](../InterviewPreparation.md)

Given an array of integers `nums` containing `n + 1` integers where each integer is in the range `[1, n]` inclusive.

There is only **one repeated number** in `nums`, return this repeated number.

You must solve the problem **without** modifying the array `nums` and uses only constant extra space.


**Example 1:**
```
Input: nums = [1,3,4,2,2]
Output: 2
```

**Example 2:**
```
Input: nums = [3,1,3,4,2]
Output: 3
```

**Constraints:**

- <code>1 <= n <= 10<sup>5</sup></code>
- <code>nums.length == n + 1</code>
- <code>1 <= nums[i] <= n</code>
- All the integers in `nums` appear only **once** except for **precisely one integer** which appears **two or more** times.

**Follow up:**

- How can we prove that at least one duplicate number must exist in `nums`?
- Can you solve the problem in linear runtime complexity?


## PYTHON

```python
class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        slow, fast = 0, 0

        while True:
            slow = nums[slow]
            fast = nums[nums[fast]]

            if slow == fast:
                break
        
        a_slow = 0  ## Another slow pointer
        while True:
            slow = nums[slow]
            a_slow = nums[a_slow]

            if slow == a_slow:
                return slow
```


&larr; [Back to Interview Preparation](../InterviewPreparation.md)