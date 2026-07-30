class Solution {
    public int minimumPushes(String word) {
        int ans=0;
        int n=word.length();
        int remaining=n;
        if(n<=8) return n;
        int presses=1;
        while(remaining>0){
            int take=Math.min(8,remaining);
            ans+=take*presses;
            remaining=remaining-take;
            presses++;
        }
        return ans;

    }
}