class Solution {
    public int digitFrequencyScore(int n) {
        n = Math.abs(n);
        int sum = 0;
        while(n>0){
            int digit = (int) (n%10);
            sum+=digit;
            n/=10;
        }
        return sum;
    }
}