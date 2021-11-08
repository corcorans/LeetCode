// https://leetcode.com/problems/max-increase-to-keep-city-skyline/
class Solution
{
   public int maxIncreaseKeepingSkyline(int[][] grid)
   {
      int n = grid.length;
      int[] rows = new int[n];
      int[] columns = new int[n];
        
      for(int row = 0; row < n; ++row)
      {
         for(int col = 0; col < n; ++col)
         {
            rows[row] = Math.max(rows[row], grid[row][col]);
            columns[col] = Math.max(columns[col], grid[row][col]);
         }
      }
        
      int answer = 0;
      for(int row = 0; row < n; ++row)
         for(int col = 0; col < n; ++col)
            answer += Math.min(rows[row], columns[col]) - grid[row][col];
        
      return answer;
   }
}