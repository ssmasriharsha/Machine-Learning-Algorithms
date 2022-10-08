class Solution {
    public boolean isScramble(String s1, String s2) {
        HashMap<String, Boolean> hashMap = new HashMap();
        return IsScramble(s1, s2, hashMap);
    }
    
    public boolean IsScramble(String s1, String s2, HashMap<String, Boolean> hashMap)
    {
        if(s1.equals(s2)) // BC condition to check if single chars are equal or not
            return true;
        
        int [] count = new int[26]; // additional condition to check if the chars present in 
        //both the strings should be same order can be different but atleast the chars and 
        //count should be same else, there is no point to move further with this.
        for(int i=0;i<s1.length();i++)
        {
            count[s1.charAt(i)-'a']++;
            count[s2.charAt(i)-'a']--;
        }
        
       