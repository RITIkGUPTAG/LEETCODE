class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int len=-1;
        int arr[]=new int[26];
          Arrays.fill(arr,-1);
        for(int i=0; i<s.length(); i++){
            int idx=s.charAt(i)-'a';
            if(arr[idx]==-1){
                arr[idx]=i;
            }
            else{
                int temp=arr[idx];
                len=Math.max(len,i-temp-1);
            }
        }
        return len ;
    }
}