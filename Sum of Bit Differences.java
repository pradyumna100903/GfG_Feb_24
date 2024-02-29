class Solution {
    long sumBitDifferences(int[] arr, int n) {
         long sum = 0;
   
   for(int bit = 1;bit<18;bit++) {
       long one = 0, zero = 0;
       
       for(int i = 0;i<n;i++) {
           
           if((arr[i] & 1)==1)
             one++;
            
            else
             zero++;
             
             arr[i] = arr[i]>>1;
       }
       
       sum = sum+(one*zero);
   }
   
   return sum*2;
    }
}

