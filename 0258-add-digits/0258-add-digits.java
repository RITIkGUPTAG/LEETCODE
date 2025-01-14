class Solution {
    public int addDigits(int num) {
        if(num<10){
            return num;
        }
        int sum=0;
        int sum2=0;
      
        while (num>0){
          sum += num%10;
            num /=10;
        }
         int res=sum;
         if(res>9){
           while (res>0){
          sum2 += res%10;
            res /=10;
        }  
         }else{
            return sum;
         }
         int res2=0;
    if(sum2>9){
           while (sum2>0){
          res2 += sum2%10;  // 100%
            sum2 /=10;
        }  
    }
    else{
        return sum2;
    }
        return res2;
    }
}




// class Solution {
//     public int addDigits(int num) {
//         if(num<10){
//             return num;     //45%
//         }
//         int r=num%9;
//         if(r==0){
//             return 9;
//         }
//         else{
//         return r;
//         }
        
//     }
// }