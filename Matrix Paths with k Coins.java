class Solution {
    long numberOfPath(int n, int k, int [][]arr) {
        return find(n,k,0,0,arr);
    }
    long find(int n,int k,int i,int j,int [][]arr){
        if(i>=n || j>=n || k<0) 
        return 0;
        k=k-arr[i][j];
        if(i==n-1 && j==n-1){
            if(k==0)
            return 1;
            return 0;
        }
        return  find(n,k,i,j+1,arr)+find(n,k,i+1,j,arr);
    }
}
