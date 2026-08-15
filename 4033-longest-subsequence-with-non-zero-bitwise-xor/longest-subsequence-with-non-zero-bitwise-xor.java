class Solution {
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
        int ans=nums[0];
        int noz=0;
        if(nums[0]==0)noz=1;
        for(int i=1;i<n;i++){
            ans^=nums[i];
            if(nums[i]==0) noz++;
        }
        if(noz==n) return 0;
        if(ans==0) return n-1;
        return n;
        
    }
}