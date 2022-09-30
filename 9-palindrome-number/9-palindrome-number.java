class Solution {
    public boolean isPalindrome(int x) {
 int a=0;
        int n = x;

        if(x<0){
            return false;
        }
      
        else{
      
        while(x>0){
            a = a*10+x%10;
            x=x/10;
         }
        }

        if(n==a){
                return true;
            }
            else{
                return false;
            }
       
}
    
}