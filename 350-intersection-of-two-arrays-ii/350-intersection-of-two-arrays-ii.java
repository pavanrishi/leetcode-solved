class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer>a=new ArrayList<Integer>();
        for(int i =0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++ ){
                if(nums1[i]==nums2[j]){
                    a.add(nums2[j]);
                    nums2[j]=-1;
                    break;
                }
            }
        }
        int arr[]=new int[a.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=a.get(i);
        }
        return arr;
    }
}