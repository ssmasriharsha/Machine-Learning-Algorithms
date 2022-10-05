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
       # finding number
        match = re.search("^[\d]+", s)
        if match is not None:
            integer = int(match.group())
        else:
            integer = 0
        
        result = integer * mul
        if result >= (2 ** 31) - 1:
            result = (2 ** 31) - 1
        elif result <= (2 ** 31) * (-1):
            result = (2 ** 31) * (-1)
        return result
        
       
