class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int n=s.length();
        int i=0;
        int j=0;
        int maxLen=0;
        while(j<n){
            char cj=s.charAt(j);
            map.put(cj,map.getOrDefault(cj,0)+1);
            if(map.size()==j-i+1){
                maxLen=Math.max(maxLen,j-i+1);
            }
            else if(map.size()<j-i+1){
                while(map.size()<j-i+1){
                    char ci=s.charAt(i);
                    map.put(ci,map.getOrDefault(ci,0)-1);
                    if(map.get(ci)==0){
                        map.remove(ci);
                    }
                    i++;
                }
                
            }
            j++;
        }
        return maxLen;
    }
}