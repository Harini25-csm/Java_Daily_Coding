class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int expectedSum=n*(n+1)/2;
        
        int actualSum=0;
        for(int num:nums){
            actualSum+=num;
        }
        return expectedSum - actualSum;
    }
}
/*
nums=[3,0,1]
n=3
es=6
as=3+0+1 ==> 4
return es-as ==> 6-4=2
*/