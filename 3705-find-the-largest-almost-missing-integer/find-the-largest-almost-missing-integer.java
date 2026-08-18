class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer>mpp=new HashMap<>();
        int maxi=Integer.MIN_VALUE;
        if(k==n) return Arrays.stream(nums).max().getAsInt();
        for(int el:nums){
            mpp.put(el,mpp.getOrDefault(el,0)+1);
        }
        if(mpp.size()==1) return -1;
        if(k==1){
        for(int el:nums){
            if(mpp.get(el)==1 && el>maxi){
                maxi=el;
            }
        }
        return maxi;
        }
        if(mpp.get(nums[0])==1 && mpp.get(nums[n-1])==1) return Math.max(nums[0],nums[n-1]);
        else if(mpp.get(nums[0])>1 && mpp.get(nums[n-1])==1) return nums[n-1];
        else if(mpp.get(nums[0])==1 && mpp.get(nums[n-1])>1) return nums[0];
        
        return -1;
    }
}