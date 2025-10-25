class Solution {
    public int totalMoney(int n) {
        int res = 0;
        int mondayMoney = 1;

        while(n > 0){
            int money = mondayMoney;

            for(int i = 1; i <= (int)Math.min(7, n); i++){
                res = res + money;
                money++;
            }
            n = n - 7;
            mondayMoney++;
        }

        return res;
    }
}