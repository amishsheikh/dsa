import java.util.List;

public class RichestCustomerWealth {
    public static void main(String[] args) {
         int[][] arr = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(arr));
    }

    public static int maximumWealth(int[][] accounts) {

        int prev_sum=0;

        for (int i = 0; i <accounts.length ; i++) {
            int curr_sum=0;
            for ( int j = 0; j < accounts[i].length; j++) {
                curr_sum += accounts[i][j];
            }
            if (prev_sum<curr_sum){
               prev_sum = curr_sum;
            }
        }
        return prev_sum;
    }
}
