public class powerOfTwo {
    public static boolean isPowerOfTwo(int n){
        if(n<=0) return false;
        while(n%2==0){
            n/=2;
        }
        return n==1;
    }
}
/*
1. if n=16
I1: 16%2==0(0)
16/2=8
I2: 8%2==0
8/2=4
I3: 4%2==0
4/2=2
I4: 2%2==0
2/2=1
I5: 1%2=1(loop stops)
return n(1)==1;

2. if n=12
I1: 12%2==0(0)
12/2=6
I2: 6%2==0
6/2=3
I5: 3%2=1(loop stops)
return n(3)==1;(wrong)
*/
