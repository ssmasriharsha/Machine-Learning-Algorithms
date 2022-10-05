class Solution:
    def myAtoi(self, s: str) -> int:
        import re
        s = s.strip()
        if len(s) == 0:
            return 0
        
        if s[0] == "-":
            mul = -1
            s = s[1:]
        elif s[0] == "+":
            mul = 1
            s = s[1:]
        else:
            mul = 1
        
       