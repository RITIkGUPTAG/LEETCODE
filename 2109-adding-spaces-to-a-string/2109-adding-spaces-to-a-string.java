import java.util.*;
class Solution {
    public String addSpaces(String s, int[] nums) {
        StringBuilder b=new StringBuilder();
        int j=0;
            for(int i=0; i<s.length(); i++){
                  
                if(j<nums.length&&i==nums[j] ){
                 b.append(" ");
                    b.append(s.charAt(i)); 
                  
                        j++;
                } else{
            
                 b.append(s.charAt(i)); 
                }   

            }
        return b.toString();

}
}