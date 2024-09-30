class Solution {
    public int countPrimes(int n) {
        if(n <= 2) return 0;
        int count = 0;
        for(int i = 2; i < n; i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }

    public boolean isPrime(int num) {
        if(num <= 1) return false;
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}
