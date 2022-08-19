import java.util.Arrays;

public class Stocks {
    public static void main(String[] args) {
int[] arr ={2,3,4,9,6,1,7,8};
        System.out.println((ans(arr)));
    }
static int ans(int[] prices){
        int max=prices[prices.length-1];
        int[] aux = new int[prices.length];
      for (int i = prices.length-1; i>= 0; i--) {
        if (max<prices[i]){
            max=prices[i];
        }
        aux[i]=max;
      }
    int maxProfit=0;
    for (int i = 0; i < prices.length; i++) {
        int profit =aux[i]-prices[i];
        if (maxProfit<profit){
            maxProfit=profit;
        }
    }
    return maxProfit;
}

}
