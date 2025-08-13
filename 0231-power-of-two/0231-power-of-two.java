class Solution {
    public boolean isPowerOfTwo(int n) {
       while(n>0){
        while(n>1){
            if(n%2==0){
                n /=2;
            }
            else{
                break;
            }
        }
        if(n==1){
            return true;
        }else{
            return false;
        }
       }
       return false;
    }
}