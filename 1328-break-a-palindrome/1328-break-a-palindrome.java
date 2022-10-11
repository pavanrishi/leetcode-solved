class Solution {
    public String breakPalindrome(String pd) {
        if(pd.length()==0 ||pd.length()==1){
            return "";
        }
        char c[]=pd.toCharArray();
        for(int i=0;i<c.length/2;i++){
            if(c[i]-'a'!=0){
               c[i]='a';
                return new String(c);
            }
        }
        c[c.length-1]='b';
    return new String(c);
    }
}