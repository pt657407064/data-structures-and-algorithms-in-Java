
public class CoinChange{
    //Main Method
    public static void main(String [] args){
        int [] coins = {1,3,5};
        int total = 10;
        System.out.println(coinChange(coins,total));
    }
    public static int coinChange(int[] coins, int total){
        int [] combination = new int[total+1];
        combination[0] = 1;
        for(int coin:coins){
          for(int i = coin;i<=total;i++){
            combination[i] += combination[i-coin];
          }
        }
        return combination[total];
    }
}
