class Solution
{
    public int isPossible(int[][] paths)
    {
        for(int i = 0; i < paths.length; i++) {
            int sum = 0;
            for(int j = 0; j < paths[0].length; j++)
                sum += paths[i][j];
                
            if(sum % 2 != 0)
                return 0;
        }
        
        return 1;
    }
}
