class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int sum=prices[0]+prices[1];
       if(sum<=money){
        return (money-sum);
       }else{
        return money;     //Time Comlexity=O(nlogn)
       }
    }
}
// class Solution {
//     public int buyChoco(int[] prices, int money) {
//         int min1 = Integer.MAX_VALUE;
//         int min2 = Integer.MAX_VALUE;                     //Time Complexity=O(n)
//         for (int i = 0; i < prices.length; i++) {
//             if (min1 > prices[i]) {
//                 min2 = min1;
//                 min1 = prices[i];
//             } else if (prices[i] < min2) {
//                 min2 = prices[i];
//             }
//         }
//         int sum = min1 + min2;
//         if (money >= sum) {
//             return money - sum;
//         } else {
//             return money;
//         }
//     }
// }
