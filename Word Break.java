class Solution
{
    public static int wordBreak(int N, String s, ArrayList<String> dictionary)
    {
        int n = s.length();
        int dp[] = new int[n + 1];
        dp[n] = 1;
        
        for(int i = n - 1; i >= 0; i--) 
        {
            for(int j = 0; j < N; j++) 
            {
                String word = dictionary.get(j);
                if(i + word.length() <= n && s.substring(i, i + word.length()).equals(word) && dp[i + word.length()] != 0)
                    dp[i] = 1;
            }
        }
        
        return dp[0];
    }
}
