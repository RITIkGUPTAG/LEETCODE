class Solution {
    public int[] constructRectangle(int a) {
        int[] arr = new int[2];
        int sqrt = (int) Math.sqrt(a); 
        for (int i = sqrt; i > 0; i--) {
            if (a % i == 0) { 
                int j = a / i;
                arr[0] = j;
                arr[1] = i; 
                break; 
            }
        }
        return arr;
    }
}
