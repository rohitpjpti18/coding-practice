from functools import cmp_to_key
from typing import List

class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals = sorted(intervals, key=lambda x: x[0]);
        print(intervals)
        
        result = []
        result.append(intervals[0])

        for i in range(1, len(intervals)):
            if(result[-1][1] < intervals[i][0]):
                result.append(intervals[i]);
            else:
                result[-1][1] = max(result[-1][1], intervals[i][1]);
        
        return result