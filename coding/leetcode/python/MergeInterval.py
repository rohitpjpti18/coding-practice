from functools import cmp_to_key
from typing import List

class Solution:

    def comparator(self, a:List[int], b:List[int]) -> int:
        if a[0] != b[0]:
            return a[0]-b[0]
        else:
            return a[1]-b[1]

    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort(key=cmp_to_key(self.comparator));
        print(intervals)
        
        result = []
        result.append(intervals[0])

        for i in range(1, len(intervals)):
            temp = result[-1]
            if intervals[i][0] <= temp[1] and intervals[i][1] > temp[1]:
                temp[1] = intervals[i][1]
                continue;
            
            if intervals[i][0] > temp[1]:
                result.append(intervals[i])
        
        return result