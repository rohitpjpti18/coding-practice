from typing import List


class Solution:
    def modifiedBinarySearch(self, matrix:List[List[int]], target: int) -> List[int]:
        colLength = len(matrix[0]) - 1
        start, end = 0, len(matrix) - 1

        while start < end:
            mid = start + ((end - start)//2)  ## No use here since it's python but for the peace of mind of some entitled little pricks
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