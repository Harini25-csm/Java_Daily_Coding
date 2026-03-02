package Foundation;
class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
}
/*
nums = [-1, 0, 3, 5, 9, 12]
target = 9
Index:  0   1   2   3   4   5
Value: -1   0   3   5   9  12
left = 0
right = nums.length - 1 = 5
mid = left + (right - left) / 2
mid = 0 + (5 - 0) / 2
mid = 0 + 5/2
mid = 2
nums[mid] = nums[2] = 3
3 == 9 ?  ❌ No
3 < 9  ?  ✅ Yes
left = mid + 1
left = 2 + 1
left = 3
left = 3
right = 5
mid = 3 + (5 - 3) / 2
mid = 3 + 2/2
mid = 3 + 1
mid = 4
nums[mid] = nums[4] = 9
9 == 9 ? ✅ YES
return 4
*/