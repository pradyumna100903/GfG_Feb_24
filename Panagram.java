class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String s) {
         int count = 0;
        int[] freq = new int[26];
        s = s.toLowerCase();
        for(char ch : s.toCharArray()){
            if(ch>='a' && ch<='z'){
                freq[ch-'a']++;
                if(freq[ch-'a'] == 1) count++;
            }
        }
        return count == 26;
}
}
