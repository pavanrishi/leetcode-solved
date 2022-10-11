class Solution {
    public String[] findWords(String[] words) {
      String fr="qwertyuiopQWERTYUIOP";
    String sr="asdfghjklASDFGHJKL";
        String tr="zxcvbnmZXCVBNM";
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            int ct=0;
            int ct1=0;
            int ct2=0;
           int len=words[i].length();
              for(int j=0;j<len;j++){
                if(fr.contains(Character.toString(words[i].charAt(j)))){
                    ct++;
                }
                else if(sr.contains(Character.toString(words[i].charAt(j)))){
                    ct1++;
                }
                else if(tr.contains(Character.toString(words[i].charAt(j)))){
                    ct2++;
                }
                if(ct==len || ct2==len || ct1==len){
                    list.add(words[i]);
               }
              }
        }
        String str []= new String[list.size()];
        list.toArray(str);
        return str;
    }
}