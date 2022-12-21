class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        slow, fast = 0, 0

        while True:
            slow = nums[slow]
            fast = nums[nums[fast]]

            if slow == fast:
                break
        
        a_slow = 0  ## Another slow pointer
        while True:
            slow = nums[slow]
            a_slow = nums[a_slow]

            if slow == a_slow:
                return slow