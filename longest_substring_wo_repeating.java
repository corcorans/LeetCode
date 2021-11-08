// https://leetcode.com/problems/longest-substring-without-repeating-characters/
class Solution
{
    public int lengthOfLongestSubstring(String s)
    {
        int result = 0;
        Map<Character, Integer> m = new HashMap<>();
        for(int i = 0, j = 0; i < s.length(); ++i)
        {
            if(m.containsKey(s.charAt(i)))
                j = Math.max(m.get(s.charAt(i)), j);
            
            result = Math.max(result, i - j + 1);
            m.put(s.charAt(i), i + 1);
        }
        return result;
    }
}