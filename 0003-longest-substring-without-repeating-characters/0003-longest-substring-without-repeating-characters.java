import java.util.*;
import java.util.ArrayList;
class Solution {
    public int lengthOfLongestSubstring(String s) {
     int end=0,start=0, maxleng=0;
        List<Character> l=new ArrayList<Character>();
        while(end<s.length()){
           if(!l.contains(s.charAt(end))){
               l.add(s.charAt(end));
            end++;
            maxleng=Math.max(maxleng,l.size());
        }
        else{
            l.remove(Character.valueOf(s.charAt(start)));
            start++;
        }
        }
            return maxleng;
    }
}