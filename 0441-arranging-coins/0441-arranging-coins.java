class Solution {
    public int arrangeCoins(int n) {
        int k=0;
        // if(n==1){
        //     return 1;
        // }
       for(int i=1; i<=n; i++){
        if(n>=i){
            n -=i;
            k++;
        }else{
            break;

        }
       } 
       return k;
    }
}