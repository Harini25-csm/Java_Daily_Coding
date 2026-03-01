class Solution {
    public int removeDuplicates(int[] nums) {        
        // If array has only one element
        if (nums.length == 0) {
            return 0;
        }        
        // This pointer keeps track of unique elements
        int k = 1;   // first element is always unique        
        // Start checking from second element
        for (int i = 1; i < nums.length; i++) {            
            // If current element is different from previous
            if (nums[i] != nums[i - 1]) {
                
                nums[k] = nums[i];  // place unique element
                k++;                // move unique pointer
            }
        }        
        return k;   // number of unique elements
    }
}
/*
nums=[1,1,2]
k=1 ==> 1st ele('1' which is in index 0) always unique
int i=1 => nums[i]!=nums[i-1](1!=1) false so, skip
2!=1 => nums[k]=nums[i](k=inde0(1),index1(2)), k=(1,2)
k++(increase the index to place next unique ele) k=2 , nums=[1,2,2]
i → scans the array
k → marks where next unique number goes
If duplicate:
Ignore it
*/



// import java.util.HashSet;
// class removeDuplicates {
//     public int removeDuplicates(int[] nums) {
//         HashSet<Integer> set=new HashSet<>();
//         int k=0;
//         for(int i=0;i<nums.length;i++){
//             if(!set.contains(nums[i])){
//                 set.add(nums[i]);
//                 nums[k]=nums[i];
//                 k++;
//             }
//         }
//         return k;
//     }
// }
/*
nums=[1,1,2]
k=0
int i=0 => index(0)=1 is not in set, so add in nums[k] => (1), k++
i=1 => 1 , already there in set, so skip
int i=2 => 2, unique, add it to nums[k] =>(1,2)
*/