class Solution {
    public boolean checkIfPangram(String s) {
        
        for(int i=0;i<26;i++){
            char a= (char)('a'+i);
            if(s.indexOf(a)==-1){
                return false;
            }
        }
        return true;
    }
}