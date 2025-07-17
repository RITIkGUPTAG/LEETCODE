class Solution {
    public boolean isAnagram(String s, String t) {
        int j=0;
        if(s.length()!=t.length()){
            return false;
        }
        
          char tem[] = s.toCharArray();
        Arrays.sort(tem);
   String n= new String(tem); 
        
        
        char temp[] = t.toCharArray();
        Arrays.sort(temp);
        String m=new String(temp);
        
        
        for(int i=0; i<n.length();i++){
            if(n.charAt(i)==m.charAt(j)){
                j++;
            }else{
            return false;
        }
        }
        return true;
    }
}