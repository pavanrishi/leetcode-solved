class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
             ArrayList< String> al= new ArrayList<>();
         ArrayList< Integer> b= new ArrayList<>();
        int temp=0;
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                 temp=0;
            if(list1[i].compareTo(list2[j])==0){
                temp =i+j;
                b.add(temp);
                al.add(list1[i]);
            }
            
            }
        }
        int g=Collections.min(b);
         ArrayList< String> bl= new ArrayList<>();
        for(int i=0;i<b.size();i++){
            if(b.get(i)==g){
                bl.add(al.get(i));
            }
        }
        String s[]= new String [bl.size()];
         for(int i=0;i<s.length;i++){
             s[i]=bl.get(i);
         }
        return s;
        
        
    }
}