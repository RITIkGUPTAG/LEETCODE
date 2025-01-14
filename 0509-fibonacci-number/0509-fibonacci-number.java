class Solution {
    public int fib(int n) {
        List<Integer>list=new ArrayList<>();

        int a=0, b=1;
        list.add(a);
        list.add(b);
        if(n==0) return a;
        if(n==1) return b;
        for(int i=2; i<=n; i++){
           int c=a+b;
           list.add(c);
           a=b;
           b=c;
        } 
        return list.get(n);
    }
}