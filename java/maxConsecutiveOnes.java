class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currentCount=0;
        int maxCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                currentCount++;
                maxCount=Math.max(maxCount,currentCount);
            }else{
                currentCount=0;
            }
        }
        return maxCount;
    }
}
/*
nums = [1,0,1,1,0,1]
cc=0, mc=0 
1==1 cc++ (1) => mc=Math.max(mc,cc)
                             0, 1   ==>(1)mc
0 => cc=0
1==1 =>cc++ (1) => mc=Math.max(mc,cc)
                                0, 1   ==>(1)mc
1==1 => cc++ (2) =>mc=Math.max(mc,cc)
                                1, 2   ==>(2)mc
0 => cc=0
1==1 => cc++ (1)=>mc=Math.max(mc,cc)
                               0, 1   ==>(1)mc

return mc ==> 2
*/