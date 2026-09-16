class Solution {
    public int fib(int n) {
       return fibo(n);
    }
    static int fibo(int n){
        int a = 0;
        int b = 1;
        if (n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}