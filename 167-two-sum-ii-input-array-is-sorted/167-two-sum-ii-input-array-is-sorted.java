class Solution {
    public int[] twoSum(int[] n, int t) {
        int l=0;
        int r=n.length-1;
        //int a[]=new int[2];
        while(l<r){
            int sum=n[r]+n[l];
            if(sum==t){
               return new int[]{l+1,r+1};
            }
            else if(sum<t){
                l++;
            }
            else if(sum>t){
                r--;
            }
            
        }
        return new int[]{};
    }
}