class Solution {
    public void solve(int index,int[]arr,int target,List<Integer>ans,List<List<Integer>>res,int k){
        int n=arr.length;
        if(index==n){
        if(target==0 && ans.size()==k){
            res.add(new ArrayList<>(ans));
        }
            return;
        }
        if(arr[index]<=target){
            ans.add(arr[index]);
            solve(index+1,arr,target-arr[index],ans,res,k);
            ans.remove(ans.size()-1);
        }
        solve(index+1,arr,target,ans,res,k);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[]arr={1,2,3,4,5,6,7,8,9};
        List<List<Integer>>res=new ArrayList<>();
        solve(0,arr,n,new ArrayList<>(),res,k);
        return res;
    }
}