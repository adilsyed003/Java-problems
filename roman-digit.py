class Solution(object):
    def romanToInt(self, s):
        sum = 0
        roman = {
            'L' : 50 , 'C':100 , 'D':500 , 'M':1000 , 'X':10 , 'V':5 , 'I' : 1
        }    
        i=0 
        while(i<len(s)):
            if i+1 < len(s) and s[i] == 'I' and s[i+1] in {'V','X'}:
                sum += roman[s[i+1]] - roman[s[i]]
                i += 2
            elif i+1 < len(s) and s[i] == 'X' and s[i+1] in {'C','L'}:
                sum += roman[s[i+1]] - roman[s[i]]
                i += 2
            elif i+1 < len(s) and s[i] == 'C' and s[i+1] in {'D','M'}:
                sum += roman[s[i+1]] - roman[s[i]]
                i += 2
            else:
                sum += roman[s[i]]
                i += 1
        return sum
