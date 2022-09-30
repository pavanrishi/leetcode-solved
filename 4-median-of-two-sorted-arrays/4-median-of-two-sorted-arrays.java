class Solution {
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a[]= new int[nums1.length+nums2.length];  
        int i0=0;
        int i1=0;
        int i2=0;
        while(i0<nums1.length&&i1<nums2.length){
            if(nums1[i0]<=nums2[i1]){
                a[i2]=nums1[i0];
                i0++;
                i2++;
            }
            else if(nums1[i0]>nums2[i1]){
                a[i2]=nums2[i1];
                i1++;
                i2++;
            }
        }
    while(i0<nums1.length){
         a[i2]=nums1[i0];
                i0++;
                i2++;
    }
        while(i1<nums2.length){
             a[i2]=nums2[i1];
                i1++;
                i2++;
        }
        if(a.length%2==0){
         return  (double)(a[(a.length)/2]+a[(a.length-1)/2])/2;
        }
       return a[(a.length/2)];     
    }
}