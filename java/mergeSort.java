public class mergeSort {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;// last valid element in nums1
        int j=n-1;// last element in nums2
        int k=m+n-1;// last index of nums1

        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i--;
            }else{
                nums1[k]=nums2[j];
                j--;
            }
            k--;
        }
        // If nums2 still has elements left
        while(j>=0){
            nums1[k]=nums2[j];
            j--;
            k--;
        }
    }
}
/*
nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
i=3 , j=6 =>3>=0 && 6>=0
3>6 => nums1[k]=6(nums2[j])
j-- => 5; 3>5 =>5
3>2 =>nums1[k]=3(nums1[i])
i-- => 2
2>2 => 2 => 2(nums2[j])
[1,2,2,3,5,6]
   ↑
   k=1
i=1, j=-1, k=1

*/
