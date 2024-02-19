class Solution{
    static int minValue(String s, int k){
        int[]freq = new int[26];
        for(char c:s.toCharArray())freq[c-'a']++;
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int f:freq)pq.add(f);
        while(k>0){
            int ele = pq.poll();
            pq.add(ele-1);
            k--;
        }
        int sum = 0;
        while(!pq.isEmpty())sum+=pq.peek()*pq.poll();
        return sum;
    }
}

