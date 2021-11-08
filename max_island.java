// https://leetcode.com/problems/max-area-of-island/
class Solution
{
    public int[][] grid;
    public boolean[][] hasSeen;
    
    public int area(int row, int column)
    {
        if(row < 0 || row >= this.grid.length || column < 0 || column >= this.grid[0].length ||
           this.hasSeen[row][column] || this.grid[row][column] == 0)
            return 0;
        
        this.hasSeen[row][column] = true;
        
        return(1 + area(row + 1, column) + area(row - 1, column) + area(row, column - 1) + area(row, column + 1));
    }
    
    public int maxAreaOfIsland(int[][] grid)
    {
        int maxArea = 0;
        
        this.grid = grid;
        this.hasSeen = new boolean[grid.length][grid[0].length];
        
        for(int row = 0; row < grid.length; ++row)
            for(int column = 0; column < grid[0].length; ++column)
                maxArea = Math.max(maxArea, area(row, column));
        
        return maxArea;
    }
}