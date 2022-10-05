class Solution {
    public boolean isValid(String s) {
        ArrayList<Character > list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
        if(c=='('||c=='{'||c=='['){

        list.add(c);
            }
        else if((c==')'||c=='}'||c==']')&&list.size()>0){
            char e =list.remove(list.size()-1);                                                                             if(c==')'&&e!='(')
                  {
               return false;
                 }
                else if(c=='}'&& e!='{'){
                    return false;
                }
                else if(c==']'&& e!='['){
                    return false;
                }
            }
           else{
               return false;
           }            
       }
    if(list.size()==0){
        return true;
    }    
        return false;
    }
}