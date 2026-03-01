package Foundation;
public class palindromeNum{
    public boolean palindrome(int x){
        if(x<0){
            return false;
        }
        int original=x;
        int rev=0;
        while(x!=0){
            int digit=x%10;
            rev=rev*10+digit;
            x=x/10;
        }
        return original==rev;
    } 
}
/*
x=121
 x,digit,rev,
121,1,1
12,2,12
1,1,121
*/