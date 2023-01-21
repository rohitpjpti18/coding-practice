## https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        hashMap, left, result = dict(), 0, 0 

        for right in range(len(s)):
            if hashMap.get(s[right]) != None:
                left = max(left, hashMap.get(s[right]) + 1)
            hashMap[s[right]] = right
            result = max(result, right-left+1)
        
        return result
