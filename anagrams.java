// https://leetcode.com/problems/group-anagrams/
class Solution
{
   public List<List<String>> groupAnagrams(String[] strs)
   {
      List<List<String>> anagrams = new ArrayList<>();
      HashMap<String, List<String>> map = new HashMap<>();
     
      for(String str : strs)
      {
         char[] characters = str.toCharArray();
         Arrays.sort(characters);
         
         String key = String.valueOf(characters);
         if(!map.containsKey(key))
            map.put(key, new ArrayList<>());
         
         map.get(key).add(str);
      }
     
      return new ArrayList<>(map.values());
   }
}