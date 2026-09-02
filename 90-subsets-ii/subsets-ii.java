class Solution {
    public void solve(int index,int[]arr,List<List<Integer>>res,List<Integer>ans){
        int n=arr.length;
        res.add(new ArrayList<>(ans));
        if(index>n-1){
            return;
        }
        for(int i=index;i<n;i++){
            if(i>index && arr[i]==arr[i-1]) continue;
            ans.add(arr[i]);
            solve(i+1,arr,res,ans);
            ans.remove(ans.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        Arrays.sort(nums);
        solve(0,nums,res,new ArrayList<>());
        return res;

    }
}