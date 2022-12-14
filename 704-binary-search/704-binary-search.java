class Solution {
    public int search(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;
        int mid;
        if(nums.length==1&&target==nums[0]){
            return 0;
        }
        while(start<=end){
            mid=(end+start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start = mid+1;
            }
        }
    return -1;
    }
    
}