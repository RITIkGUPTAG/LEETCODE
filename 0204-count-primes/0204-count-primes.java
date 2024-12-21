class Solution {
    public int countPrimes(int n) {
        if (n < 2) return 0;
        
int limit =(int)Math.sqrt(n);
        // Create a boolean array to mark non-prime numbers
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i <= limit; i++) {
           if( isPrime[i] ==false){
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = true;;
                }
            }
        
        }

        // Count prime numbers
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]==false) {
                count++;
            }
        }
        return count;
    }
}
