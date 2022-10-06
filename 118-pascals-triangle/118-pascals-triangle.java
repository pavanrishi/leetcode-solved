import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
List<List<Integer>> gen = new ArrayList<>();
        gen.add(new ArrayList<Integer>(Arrays.asList(1)));
        for(int i=1;i<numRows;i++){
    List<Integer> li=new ArrayList<>();
            for(int j=0;j<=i;j++){
 if(j==0||j==i){
   li.add(1);
 }
                else{
                    li.add(gen.get(i-1).get(j)+gen.get(i-1).get(j-1));
                }
            
            }
            gen.add(li);
        
        }
        return gen;
    }
}