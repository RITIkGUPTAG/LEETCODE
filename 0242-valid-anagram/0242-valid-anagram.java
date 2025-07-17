class Solution {
    public boolean isAnagram(String s, String t) {
        int j=0;
        if(s.length()!=t.length()){
            return false;
        }                                          //Time Complexity=O(nlogn)
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


// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if(s.length()!=t.length()){
//             return false;
//         }                                   //Time Complexity=O(n)
//         int arr[]=new int[26];
//         for(int i=0; i<s.length(); i++){
//             int idx=s.charAt(i)-'a';
//             arr[idx] +=1;
//         }
//          for(int i=0; i<t.length(); i++){
//             int idx=t.charAt(i)-'a';
//             arr[idx] -=1;
//         }
//         for(int i=0; i<arr.length; i++){
//             if(arr[i]!=0){
//                 return false;
//             }
//         }
//         return true;
//     }
// }
