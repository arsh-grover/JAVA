class Solution {
    public boolean helper(int[]arr,int k,long mid){
        int count=1;
        long sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]<=mid){
                sum+=arr[i];
            }
            else{
                count++;
                if(count>k) return false;
                sum=arr[i];
            }
        }
            return true;
    }
    public int splitArray(int[] nums, int k) {

        int n=nums.length;
        long low=Arrays.stream(nums).max().getAsInt();
        long high=0;
        for(int i=0;i<n;i++){
            high+=nums[i];
        }
        int ans=-1;
        while(low<=high){
            long mid=low+(high-low)/2;
            if(helper(nums,k,mid)){
                ans=(int)mid;
                high=mid-1;
            }
            else low=mid+1;

        }
        return ans;
    }
}