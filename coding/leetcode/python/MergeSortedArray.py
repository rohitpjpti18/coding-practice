from typing import List

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        ptr1: int = m-1;
        ptr2: int = n-1;        
        k: int = len(nums1)-1;
        while k >= 0:
            if ptr2 < 0 or (ptr1 >= 0 and nums1[ptr1] > nums2[ptr2]):
                nums1[k] = nums1[ptr1]
                ptr1-=1 
            elif ptr1 < 0 or (ptr2 >= 0 and nums1[ptr1] <= nums2[ptr2]):
                nums1[k] = nums2[ptr2]
                ptr2-=1
            k-=1