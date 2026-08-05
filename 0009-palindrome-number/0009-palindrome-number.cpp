class Solution {
public:
    bool isPalindrome(int x) {
        int digit=0;
   long orig=x;
    long rev=0;
   while(x!=0){
    digit=x%10;
    x=x/10;
    rev=digit+rev*10;
   }
   if(orig<0) return false;
   if(orig==rev){
    return true;
   }
   else return false;
    }
};