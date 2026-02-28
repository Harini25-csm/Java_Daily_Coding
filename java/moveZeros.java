class Solution {
    public void moveZeroes(int[] nums) {
        int k=0; // position to place next non-zero
        // position to place next non-zero
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[k]=nums[i];
                k++;
            }
        }
        // Step 2: Fill remaining positions with 0
        while(k<nums.length){
            nums[k]=0;
            k++;
        }
    }
}
/*
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
*/