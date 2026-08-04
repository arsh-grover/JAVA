class Solution {
    public List<Integer> findMissingElements(int[] arr) {
        HashSet<Integer>map=new HashSet<>();
        for(int num:arr){
            map.add(num);
        }
        List<Integer>ans=new ArrayList<>();
        int start=Arrays.stream(arr).min().getAsInt();
        int end=Arrays.stream(arr).max().getAsInt();
        for(int i=start;i<=end;i++){
            if(!(map.contains(i))){
                ans.add(i);
            }
        }
        return ans;
    }
}