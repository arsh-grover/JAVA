class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer>map=new HashSet<>();
        for(int el:nums){
            map.add(el);
        }
        int i=1;
        int sum=nums[0];
        int n=nums.length;
        while(i<n && nums[i]==nums[i-1]+1){
            sum+=nums[i];
            i++;
        }
        while((map.contains(sum))){
            sum+=1;
        }
        return sum;
    }
}