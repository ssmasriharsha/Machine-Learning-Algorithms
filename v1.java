class Solution {
    public List<String> letterCombinations(String digits) {
        List<String>ans=helper("",digits);
        if (ans.contains("")){
            ans.remove("");
        }
        return ans;
        
    }
    
    static List<String> helper(String p, String up){
        if (up.isEmpty()){
            ArrayList<String>data = new ArrayList<>();
            data.add(p);
            return data;
        }

        