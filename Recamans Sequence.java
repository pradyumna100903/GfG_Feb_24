class Solution{
    static ArrayList<Integer> recamanSequence(int n){
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(0);
        int curr = 0;
        Set<Integer> s = new HashSet<>();
        s.add(0);
        for(int i = 1; i<n ;i++ ){
            int c= curr-i;
            if(c<0 || s.contains(c)){
            c= curr +i;
            }
        
            ls.add(c);
            s.add(c);
            curr = c;
        }
        return ls;
    }
}
