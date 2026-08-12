class Solution {
    int MOD=1_000_000_007;
    long solve(long number,long power){
        if(power==0) return 1;
        long half=solve(number,power/2);
        long result=(half*half)%MOD;
        if(power%2==1){
            result=(result*number)%MOD;
        }
        return result;
    }
    public int countGoodNumbers(long n) {
        
        
        long x= solve(5,(n+1)/2);
        
        long y= solve(4,n/2);

        return (int)((x*y)%MOD);

    }
}