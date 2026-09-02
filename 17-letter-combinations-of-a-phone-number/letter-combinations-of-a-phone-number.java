class Solution {
    public void solve(int index,String digits,HashMap<Character,String>map,List<String>ans,StringBuilder comb){
        if(index==digits.length()){
            ans.add(comb.toString());
            return;
        }
        String letters=map.get(digits.charAt(index));
        for(int i=0;i<letters.length();i++){
            comb.append(letters.charAt(i));
            solve(index+1,digits,map,ans,comb);
            comb.deleteCharAt(comb.length()-1);
            
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String>ans=new ArrayList<>();
        HashMap<Character,String>map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        solve(0,digits,map,ans,new StringBuilder());
        return ans;

    }
}