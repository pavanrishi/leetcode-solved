class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int arr[]=new int[n];
        int i=0;
        while(i<n){
            int a=(i+k)%n;
            arr[a]=nums[i];
            i++;
        }
      for(int j=0;j<n;j++){
          nums[j]=arr[j];
      }
    }
}