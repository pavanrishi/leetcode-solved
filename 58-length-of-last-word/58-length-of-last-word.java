class Solution {
    public int lengthOfLastWord(String s) {
        int ct=0;
        s=s.trim();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                ct=0;
                continue;
            }
            else{
                ct++;
            }
        }
        return ct;
    }
}