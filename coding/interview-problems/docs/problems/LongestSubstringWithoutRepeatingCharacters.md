# Longest Substring Without Repeating Characters | [Leetcode](https://leetcode.com/problems/longest-substring-without-repeating-characters/)

&larr; [Back to Interview Preparation](../InterviewPreparation.md)

Given a string `s`, find the length of the **longest substring** without repeating characters.

**Example 1**

```
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
```
**Example 2**

```
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
```
**Example 3**

```
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
```

**Constraints:**

- <code>0 <= s.length <= 5 * 10<sup>4</sup></code>
- `s` consists of English letters, digits, symbols and spaces.

## JAVA

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] str = s.toCharArray();
        int l = 0, r = 0; 
        Map<Character, Integer> map = new HashMap();
        int max = 0;
        
        while(r < s.length()){
            if(map.containsKey(str[r])){
                l = Math.max(map.get(str[r]) + 1, l);    
            }
            map.put(str[r], r);
            
            max = Math.max(max, r-l+1);
            
            r++;
        }
        
        return max;
    }
}      
```

## PYTHON

```python
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        hashMap, left, result = dict(), 0, 0 

        for right in range(len(s)):
            if hashMap.get(s[right]) != None:
                left = max(left, hashMap.get(s[right]) + 1)
            hashMap[s[right]] = right
            result = max(result, right-left+1)
        
        return result
```

&larr; [Back to Interview Preparation](../../InterviewPreparation.md)