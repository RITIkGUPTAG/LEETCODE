class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
           int arr[]= new int[26];
           Arrays.fill(arr,0);
           int arr1[]= new int[26];
           Arrays.fill(arr1,0);
           for(int i=0; i<s.length()-1; i++){
            int idx=s.charAt(i)-'a';
            arr[idx]++;
           }
           for(int i=0; i<t.length()-1; i++){
            int idx=t.charAt(i)-'a';
            arr1[idx]++;
           }
            for(int i=0; i<s.length(); i++){
           if(arr[i]!=arr1[i]){
            return false;
           }
           }
           return true;
    }
}