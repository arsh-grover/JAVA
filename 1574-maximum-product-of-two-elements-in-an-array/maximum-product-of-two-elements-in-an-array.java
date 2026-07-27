class Solution {
    public int maxProduct(int[] nums) {
        int maxi=Integer.MIN_VALUE,sMaxi=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>=maxi){
                sMaxi=maxi;
                maxi=nums[i];
            }
            else if(nums[i]>=sMaxi){
                sMaxi=nums[i];
            }
        }
        return (maxi-1)*(sMaxi-1);
    }
}