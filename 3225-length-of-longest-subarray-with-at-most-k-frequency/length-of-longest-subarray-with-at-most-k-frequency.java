class Solution {
    public int maxSubarrayLength(int[] arr, int k) {
        int n=arr.length;
        int i=0,j=0;
        int maxLen=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        while(j<n){
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            while(map.get(arr[j])>k){
                map.put(arr[i],map.getOrDefault(arr[i],0)-1);
                if(map.get(arr[i])==0) map.remove(arr[i]);
                i++;
            }
            maxLen=Math.max(maxLen,j-i+1);
            j++;
        }
        return maxLen;
    }
}