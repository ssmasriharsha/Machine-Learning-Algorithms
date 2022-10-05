class Solution {
public:
    
    // function for finding lps array
    
    int find_lps(string str)
    {
        int n = str.size();
    
        vector<int> lps(n, 0);
    
        int i = 1;
    
        int j = 0;
    
        while(i < n)
        {
            if(str[i] == str[j])
            {
                lps[i] = j + 1;
            
                j++;
            
                i++;
            }
            else
            {
                if(j == 0)
                {
                    lps[i] = 0;
                
                    i++;
                }
                else
                {
                    j = lps[j - 1];
                }
            }
        }
    
        return lps[n - 1];
    }
    
    