class palindrome_num:
    def palindrome(self,x):# x=121
        if(x<0):
            return False
        s=str(x)# s="121"
        return s==s[::-1]#"121"=="121"[::-1]-->"121"=="121"