class Solution {
    public int uniquePaths(int m, int n) {
        int moves=(n-1)+(m-1);
        int r=Math.min(m-1,n-1);
        long result=1;
        for(int i=1;i<=r;i++){
            result=result*(moves-r+i)/i;
        }
        return (int)result;
    }
}