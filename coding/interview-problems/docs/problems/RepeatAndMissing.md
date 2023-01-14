# Repeat and Missing Number | [Coding Ninja](https://www.codingninjas.com/codestudio/problems/find-the-repeating-and-missing-number_1062727)


&larr; [Back to Interview Preparation](../InterviewPreparation.md)

You are given an array 'nums' consisting of first N positive integers. But from the N integers, one of the integers occurs twice in the array, and one of the integers is missing. You need to determine the repeating and the missing integer.

**Example 1**

```
Input: nums = [1,4,2,5,2]
Output: [2,3]
```
**Example 2**

```
Input: nums = [2,2]
Output: [2,1]
```
**Example 3**

```
Input: nums = [1,2,2,3]
Output: [2,4]
```
**Example 4**

```
Input: nums = [1,3,4,5,5,6,7,8,9,10]
Output: [2,5]
```


**Constraints:**

- <code>1 <= nums.length <= 10<sup>4</sup></code>
- <code>1 <= nums[i] <= nums.length</code>

## JAVA

**To be implemented**

## PYTHON

```python
class RepeatAndMissing:
    def repeatAndMissingNumber(self, inputArr):
        result = []
        for i in inputArr:
            if(inputArr[abs(i) - 1] < 0):
                result.append(abs(i))
            else:
                inputArr[abs(i) - 1] = -1*inputArr[abs(i) - 1];

        for i in range(len(inputArr)):
            if(inputArr[i] > 0):
                result.append(i + 1)
                break
        return result
```

&larr; [Back to Interview Preparation](../InterviewPreparation.md)
