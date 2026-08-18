class Solution {
    public void solve(int index,List<Integer>ans,int[]arr,int target,int n,List<List<Integer>>res){
        if(index==n){
            if(target==0){
                res.add(new ArrayList<>(ans));
            }
            return;
        }
        // take
        if(arr[index]<=target){
        ans.add(arr[index]);
        
        solve(index,ans,arr,target-arr[index],n,res);
        ans.remove(ans.size()-1);
        }
        // not take
        solve(index+1,ans,arr,target,n,res);

    }
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        int n=arr.length;
        List<List<Integer>>res=new ArrayList<>();

        solve(0,new ArrayList<>(),arr,target,n,res);
        return res;
    }
}