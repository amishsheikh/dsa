//you can buy the stock at any time and sell it at any time
//but you can 1 stock at one time you have to return the max profit after selling and buying the stocks

public class StocksBuyAndSell2 {
    public static void main(String[] args) {
         int[] arr={2,3,1,7,4,8};
        System.out.println(ans(arr));
    }

    static int ans(int[] arr){
        int profit =0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>arr[i-1]){
                profit +=arr[i]-arr[i-1];
            }
        }
        return profit;
    }
}
