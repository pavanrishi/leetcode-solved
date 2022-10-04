class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a[]=new int[m+n];
        int id =0;
        int id1=0;
        int id2=0;
        while(id<m+n){
            if(id1<m&&id2<n){
                if(nums1[id1]<nums2[id2]){
                    a[id++]=nums1[id1++];
                }
                else{
                    a[id++]=nums2[id2++];
                }
                
            }
            else if(id2==n&&id1<m){
                a[id++]=nums1[id1++];
            }
            else if(id1==m&&id2<n){
                a[id++]=nums2[id2++];
            }
        }
   for(int i=0;i<m+n;i++){
       nums1[i]=a[i];
   }    
    }
}