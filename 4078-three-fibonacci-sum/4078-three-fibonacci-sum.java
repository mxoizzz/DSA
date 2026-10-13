class Solution {
    public boolean threeFibonacciSum(int n) {
        int a = 0, b = 1;
        int sum = 0;
        while(sum<n){
            int c = a + b;
            sum = c * 2;
            if(sum == n){
                return true;
            }
            a = b;
            b = c;
        }
        return false;
    }
}