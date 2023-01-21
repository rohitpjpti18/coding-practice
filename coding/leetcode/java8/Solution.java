package leetcode.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * subarray-sum-equals-k: https://leetcode.com/problems/subarray-sum-equals-k/
 * longest-substring-without-repeating-characters: https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<Integer>();
        int n = nums.length;
        if(n == 0) return n;
        int result = 0;

        for(int i = 0; i<n; i++){
            s.add(nums[i]);
        }
        
        for(int i = 0; i < n; i++){
            if(!s.contains(nums[i]-1)){
                int temp = nums[i];
                int count = 0;
                while(s.contains(temp)){
                    temp++;
                    count++;
                }
                result = Math.max(result, count);
            }
        }
        
        return result;
    }

    // https://leetcode.com/problems/subarray-sum-equals-k/
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> mpp = new HashMap<>();
        int count = 0;
        int sum = 0;
        
        mpp.put(0, 1);
        
        for(Integer i = 0; i<nums.length; ++i) {
            sum += nums[i];
            
            if(mpp.containsKey(sum-k)) 
                count += mpp.get(sum-k);
            mpp.put(sum, mpp.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }

    // 
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0], b[0]));
        ArrayList<int[]> result = new ArrayList<>();
        
        for(int[] i: intervals){
            if(result.isEmpty() || result.get(result.size() - 1)[1] < i[0]) result.add(i);
            else result.get(result.size() - 1)[1] = Math.max(result.get(result.size()-1)[1], i[1]);
        }
        
        return result.toArray(new int[result.size()][]);
    }

    // https://leetcode.com/problems/longest-substring-without-repeating-characters/
    public int lengthOfLongestSubstring(String s) {
        char[] str = s.toCharArray();
        int l = 0, r = 0; 
        Map<Character, Integer> map = new HashMap<>();
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
