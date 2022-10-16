class Solution {
    static int gcd(int a, int b)
  {
    int result = a;
    while (result > 0) {
      if (a % result == 0 && b % result == 0) {
        break;
      }
      result--;
    }
    return result; // return gcd of a nd b
  }
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];
   return gcd(min,max);     
    }
}