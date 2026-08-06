class Solution {
    public int product(int n){
        int ans=1;
        while(n!=0){
            int digit=n%10;
            ans*=digit;
            n=n/10;
        }
        return ans;
    }
    public int smallestNumber(int n, int t) {
        int ans=0;
        for(int i=n;i<=1000;i++){
            if(product(i)%t==0){
                ans=i;
                break;
            }
        }
        return ans;
    }
}