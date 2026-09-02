class Solution {
    public void solve(int[]arr,int target,List<List<Integer>>res,List<Integer>ans,int index){
        if(target==0){
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int i=index;i<arr.length;i++){
            if(i>index && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
            ans.add(arr[i]);
            solve(arr,target-arr[i],res,ans,i+1);
            ans.remove(ans.size()-1);
        }

    }
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>>res=new ArrayList<>();
        solve(arr,target,res,new ArrayList<>(),0);
        return res;
    }
}