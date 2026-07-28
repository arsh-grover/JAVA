class Solution {
    
    public String shiftingLetters(String s, int[] arr) {
        int n=arr.length;
        for(int i=n-2;i>=0;i--){
            arr[i]=(arr[i]+arr[i+1])%26;
        }
        char[]ans=s.toCharArray();
        for(int i=0;i<n;i++){
            int shift=arr[i]%26;
            if(shift<0)shift+=26;
            ans[i] = (char)('a' + (ans[i] - 'a' + shift) % 26);
        }
        return new String(ans);
    }
}