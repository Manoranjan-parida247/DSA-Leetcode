class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count = 0;
        boolean[] taken = new boolean[baskets.length];
        for(int i = 0; i < fruits.length; i++){
            for(int j = 0; j < baskets.length; j++){
                if(fruits[i] <= baskets[j] && taken[j] == false){
                    count++;
                    taken[j] = true;
                    break;
                }
            }
        }
        return baskets.length-count;
    }
}