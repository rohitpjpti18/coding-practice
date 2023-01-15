# Unique Paths | [Leetcode](https://leetcode.com/problems/unique-paths/)

&larr; [Back to Interview Preparation](../InterviewPreparation.md)

There is a robot on an <code>m x n</code> grid. The robot is initially located at the top-left corner (i.e., <code>grid[0][0]</code>). The robot tries to move to the bottom-right corner (i.e., <code>grid[m - 1][n - 1]</code>). The robot can only move either down or right at any point in time.

Given the two integers <code>m</code> and <code>n</code>, return the number of possible unique paths that the robot can take to reach the bottom-right corner.

The test cases are generated so that the answer will be less than or equal to <code>2 * 10<sup>9</sup></code>.

**Example 1**

![image2](./media/robot_maze.png) 
```
Input: m = 3, n = 7
Output: 28
```
**Example 2**

```
Input: m = 3, n = 2
Output: 3
Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
1. Right -> Down -> Down
2. Down -> Down -> Right
3. Down -> Right -> Down
```

**Constraints:**

- `1 <= m, n <= 100`


## PYTHON

```python
class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        matrix = [0 for j in range(n)]
        matrix[0] = 1

        for i in range(m):
            for j in range(n):
                if i == 0 and j == 0:
                    continue;
                if i == 0:
                    matrix[j] = matrix[j-1]
                elif j == 0:
                    matrix[j] = matrix[j]
                else:
                    matrix[j] = matrix[j-1] + matrix[j]

        return matrix[n-1]
```

&larr; [Back to Interview Preparation](../InterviewPreparation.md)