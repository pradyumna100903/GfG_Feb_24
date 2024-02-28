class Solution{
    int DivisibleByEight(String s){
       String str = s.substring(Math.max(s.length() - 3, 0));
         int val = Integer.parseInt(str);
         if(val%8 == 0){
             return 1;
         }
         return -1; 
    }
}

