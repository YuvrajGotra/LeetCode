class Solution {
    public boolean isPrime(int num) {
        if(num <= 1) return false;
        if(num == 2) return true;
        if(num % 2 == 0) return false;

        for(int i = 3; (long) i*i <= num; i+=2) {
            if(num % i == 0) return false;
        }

        return true;
    }


    public boolean checkPrimeFrequency(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int ele: nums) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        for(int ele: map.keySet()) {
            if(isPrime(map.get(ele))) {
                return true;
            }
        }

        return false;
    }
}