class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int num:nums){
            result^=num;
        }
        return result;
    }
}
/*
nums = [4,1,2,1,2]
result = 0
result ^= each number
XOR rule:
1 ^ 1 = 0
0 ^ 0 = 0
1 ^ 0 = 1
0 ^ 1 = 1

0^4 
0  = 0000
4  = 0100
--------------
     0100 ==>4

4^1  ==> 5
5^2  ==> 7
7^1  ==> 6
6^2  ==> 4

return result ==> 4(Last value will be printed)

The variable result keeps updating.
It does NOT store all intermediate values.
It always overwrites the previous value.
At the end of the loop, whatever is inside result is returned.
*/

/*
1. for(int i = 0; i < nums.length; i++)
We use:
i < nums.length
Because last index is:
nums.length - 1

2. nums[i + 1]
for(int i = 0; i < nums.length - 1; i++)
i = nums.length - 1
i + 1 → out of bounds ❌

ex: [5, 7, 9]
length = 3
indexes = 0,1,2
nums[i+1]
0 => access 1
1=>access 2

But if i = 2:
nums[3] ❌ error
So loop should be:
i < nums.length - 1
*/