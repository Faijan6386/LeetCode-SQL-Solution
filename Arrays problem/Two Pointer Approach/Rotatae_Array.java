class Solution {
    public static void ReverseArray(int nums[], int l, int r){
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        ReverseArray(nums,0,nums.length-1);
        ReverseArray(nums,0,k-1);
        ReverseArray(nums,k,nums.length-1);
    }
}