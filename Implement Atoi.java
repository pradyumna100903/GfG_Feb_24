class Solution
{
    int atoi(String s) {
	for(int i=0; i<s.length(); i++){
           char ch = s.charAt(i);
           if(!((ch=='-' && i==0) || (ch >='0' && ch <='9'))){
               return -1;
           }
        }
     return Integer.parseInt(s);
    }
}
