class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int sum=0;
        for(int i=0; i<2; i++){
         sum +=prices[i];
        }
       if(sum<=money){
        return (money-sum);
       }else{
        return money;
       }
    }
}