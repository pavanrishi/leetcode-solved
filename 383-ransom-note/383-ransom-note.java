class Solution {
    public boolean canConstruct(String r, String m) {
     char rn[]=r.toCharArray();
        char ma[]=m.toCharArray();
        Arrays.sort(rn);
        Arrays.sort(ma);
        int ct=0;
        for(int i=0;i<ma.length;i++){
            if(ct==rn.length){
                return true;
            }
            else if(rn[ct]==ma[i]){
                ct++;
            }
        }
        if(ct==rn.length){
            return true;
        }
        return false;
        
        
    }
    
}