# Pow(x, n) | [Leetcode](https://leetcode.com/problems/powx-n/)


&larr; [Back to Interview Preparation](../InterviewPreparation.md)

Implement <code>pow(x, n)</code>, which calculates <code>x</code> raised to the power <code>n</code> (i.e., <code>x<sup>n</sup></code>).

**Example 1**

```
Input: x = 2.00000, n = 10
Output: 1024.00000
```
**Example 2**

```
Input: x = 2.10000, n = 3
Output: 9.26100
```
**Example 3**

```
Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25
```


**Constraints:**

- <code>-100.0 < x < 100.0</code>
- <code>-2<sup>31</sup> <= n <= 2<sup>31</sup>-1</code>
- <code>n</code> is an integer.
- <code>-10<sup>4</sup> <= x<sup>n</sup> <= 10<sup>4</sup></code>

## JAVA

**To be implemented**

## PYTHON

```python
class Solution:
    def runner(self, x: float, n: int) -> float:
        if n == 0:
            return 1
        if x == 0e0:
            return 0
        if n == 1:
            return x
        val:float = self.runner(x, abs(n//2))
        if n%2 == 0:
            return val*val
        else:
            return x*val*val

    def myPow(self, x: float, n: int) -> float:
        if n < 0:
            return self.runner(1/x, -n)
        else:
            return self.runner(x, n)
```

&larr; [Back to Interview Preparation](../InterviewPreparation.md)
