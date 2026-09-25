import java.util.*;

public class Main {

    public static int bestTimeToBuyAndSell(int[] nums){
        
        int n = nums.length;
        int profit = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int price: nums){
            if(minPrice < price){
                profit = Math.max(profit, price - minPrice) ;
            }
            else{
                minPrice = price;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) prices[i] = sc.nextInt();

        int profit = bestTimeToBuyAndSell(prices);
        System.out.print(profit);
      
    }
}
