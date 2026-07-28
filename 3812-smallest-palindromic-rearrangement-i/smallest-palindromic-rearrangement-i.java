class Solution {

    public String smallestPalindrome(String s) {
        int n=s.length();
        if(n==1)return s;
       char[]ans=(s.substring(0,(n/2))).toCharArray();
       Arrays.sort(ans);
       StringBuilder str=new StringBuilder(new String(ans));
       if(n%2==0){
        StringBuilder rev=new StringBuilder(str).reverse();
        str.append(rev);
       }
       if(n%2==1){
        StringBuilder rev=new StringBuilder(str).reverse();
        str.append(s.charAt((n/2)));
        str.append(rev);
        
       }
       return new String(str);
    }
}