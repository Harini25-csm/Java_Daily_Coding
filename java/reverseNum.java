class reverseNum {
    public int reverse(int x) {
        int rev=0;
        while(x!=0){
            int digit=x%10;
            x=x/10;
            if(rev>Integer.MAX_VALUE/10||rev<Integer.MIN_VALUE/10){
                return 0;
            }
            rev=rev*10+digit;
        }
        return rev;
    }
}
/*
Integer.MAX_VALUE =  2147483647
Integer.MIN_VALUE = -2147483648
if rev=214748365
214748365(rev)*10>2147483647(Integer.MAX_VALUE)
2147483650>2147483647(wrong) so, return 0;

x=123
d, x, rev
3, 12, 3
2, 1, 32
1, 0, 321
*/