#  Longest Consecutive Sequence | [Leetcode](https://leetcode.com/problems/longest-consecutive-sequence/)

&larr; [Back to Interview Preparation](../InterviewPreparation.md)

Given an unsorted array of integers `nums`, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in `O(n)` time.

**Example 1**
```
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
```
**Example 2**

```
Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
```

**Constraints:**

- <code>0 <= nums.length <= 10<sup>5</sup></code>
- <code>-10<sup>9</sup> <= nums[i] <= 10<sup>9</sup></code>


## PYTHON

```python
class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        hashSet = set({})
        result = 0

        for i in nums:
            hashSet.add(i)

        for i in nums:
            if i-1 not in hashSet:
                count = 0
                tempVal:int = i
                while tempVal in hashSet:
                    count += 1
                    tempVal += 1
                result = max(result, count)
        
        return result
```

## JAVA

```java
class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> s = new HashSet<Integer>();
        int n = nums.length;
    
        if(n == 0) return n;
        int result = 0;

        for(int i = 0; i<n; i++){
            s.add(nums[i]);
        }
        
        for(int i = 0; i < n; i++){
            if(!s.contains(nums[i]-1)){
                int temp = nums[i];
                int count = 0;
                while(s.contains(temp)){
                    temp++;
                    count++;
                }
                result = Math.max(result, count);
            }
        }
        
        
        return result;
    }
}
```

&larr; [Back to Interview Preparation](../InterviewPreparation.md)