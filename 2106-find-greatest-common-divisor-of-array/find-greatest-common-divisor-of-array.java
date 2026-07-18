class Solution {
    public int findGCD(int[] nums) {
        int min = findMin(nums);
        int max = findMax(nums);

        return gcd(min, max);
    }

    private int findMin(int[] nums){
        int min = nums[0];

        for(int num: nums){
            if(num < min){
                min = num;
            }
        }

        return min;
    }

    private int findMax(int[] nums){
        int max = nums[0];

        for(int num: nums){
            if(num > max){
                max = num;
            }
        }

        return max;
    }
    
    private int gcd(int a, int b){
        // int min = (int)Math.min(a, b);

        for(int i = a; i > 0; i--){
            if(a % i == 0 && b % i == 0){
                return i;
            }
        }

        return -1;
    }
}