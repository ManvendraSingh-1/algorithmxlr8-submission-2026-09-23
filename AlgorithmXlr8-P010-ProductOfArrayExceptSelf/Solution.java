import java.util.*;

public class Main {

    static int[] productExceptSelf(int[] nums){
        
        int n = nums.length;
        int[] product = new int[n];
        

        for(int i = 0; i < n; i++){

            int productOfArray = 1;

            for(int j = 0; j  < n; j++){
                if(j != i) productOfArray *= nums[j];
            }
            product[i] = productOfArray;
        }

        return product;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        int[] result = productExceptSelf(nums);
           for (int product : result) {
            System.out.print(product + " ");
        }

    }
}
