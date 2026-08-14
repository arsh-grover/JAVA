class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        int i=0;
        int j=0;
        int maxLen=0;
        HashMap<Character,Integer>map=new HashMap<>();
        while(j<n){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            while(map.get(s.charAt(j))>2){
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)-1);
                i++;
            }
            maxLen=Math.max(maxLen,j-i+1);
            j++;
        }
        return maxLen;

    }
}