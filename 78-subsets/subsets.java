class Solution {
    public void solve(int[]nums,int index,List<Integer>current,List<List<Integer>>ans){
        if(index==nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        solve(nums,index+1,current,ans);
        current.add(nums[index]);
        // take
        solve(nums,index+1,current,ans);
        // backtracking
        current.remove(current.size()-1);
        // not take
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        solve(nums,0,new ArrayList(),ans);
        return ans;
    }
}