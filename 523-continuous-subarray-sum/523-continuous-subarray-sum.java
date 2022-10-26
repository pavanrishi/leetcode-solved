class Solution {
public boolean checkSubarraySum(int[] nums, int k) {
    int sum =0;
 Map<Integer,Integer> hashmap = new HashMap<>(Map.of(0,0));   
    for(int i=0;i<nums.length;i++){
        sum += nums[i];
        if(!hashmap.containsKey(sum%k)){
        hashmap.put(sum%k,i+1);
        }
        else if(hashmap.get(sum%k)<i){
            return true;
        }
    }
    return false;
}

}
    
        
        
        