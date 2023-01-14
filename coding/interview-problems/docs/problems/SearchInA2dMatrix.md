# Search a 2D Matrix | [Leetcode](https://leetcode.com/problems/search-a-2d-matrix/)

&larr; [Back to Interview Preparation](../InterviewPreparation.md)

Write an efficient algorithm that searches for a value target in an m x n integer matrix. This matrix has the following properties:
    - Integers in each row are sorted from left to right.
    - The first integer of each row is greater than the last integer of the previous row.

**Example 1**

![image1](./media/mat.jpg) 

```
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
```
**Example 2**

![image2](./media/mat2%20(2).jpg) 

```
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
```

**Constraints:**

- `m == matrix.length`
- `n == matrix[i].length`
- `1 <= m, n <= 100`
- `-10`<sup>4</sup>` <= matrix[i][j], target <= 10`<sup>4</sup>

## PYTON

```python
from typing import List

class Solution:
    def modifiedBinarySearch(self, matrix:List[List[int]], target: int) -> List[int]:
        colLength = len(matrix[0]) - 1
        start, end = 0, len(matrix) - 1

        while start < end:
            mid = start + ((end - start)//2)  
            if matrix[mid][0] >= target and matrix[mid][colLength] <= target:
                return matrix[mid]
            elif matrix[mid][0] < target:
                start = mid + 1
            else:
                end = mid - 1
        
        return None

    def binarySearch(self, arr: List[int], target: int) -> bool:
        print(arr)
        if arr == None:
            return False

        start, end = 0, len(arr) - 1

        while start < end:
            mid = start + ((end - start)//2)
            if arr[mid] == target:
                return True
            elif arr[mid] > target:
                end = mid - 1
            else:
                start = mid + 1
        
        return False

    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        return self.binarySearch(self.modifiedBinarySearch(matrix, target), target)
```

&larr; [Back to Interview Preparation](../InterviewPreparation.md)