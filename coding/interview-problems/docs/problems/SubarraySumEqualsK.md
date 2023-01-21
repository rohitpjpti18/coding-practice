# Subarray Sum Equals K | [Leetcode](https://leetcode.com/problems/subarray-sum-equals-k/)

&larr; [Back to Interview Preparation](../InterviewPreparation.md)

Given an array of integers `nums` and an integer `k`, return the total number of subarrays whose sum equals to `k`.

A subarray is a contiguous **non-empty** sequence of elements within an array.

**Example 1**

```
Input: nums = [1,1,1], k = 2
Output: 2
```
**Example 2**

```
Input: nums = [1,2,3], k = 3
Output: 2
```

**Constraints:**

- <code>1 <= nums.length <= 2 * 10<sup>4</sup></code>
- `-1000 <= nums[i] <= 1000`
- <code>-10<sup>7</sup> <= k <= 10<sup>7</sup></code>

## JAVA

```java
class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> mpp = new HashMap<>();
        int count = 0;
        int sum = 0;
        
        mpp.put(0, 1);
        
        for(Integer i = 0; i<nums.length; ++i) {
            sum += nums[i];
            
            if(mpp.containsKey(sum-k)) 
                count += mpp.get(sum-k);
            mpp.put(sum, mpp.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }
}      
```

## PYTHON

```python
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
```

&larr; [Back to Interview Preparation](../../InterviewPreparation.md)