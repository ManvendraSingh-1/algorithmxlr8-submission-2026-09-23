import java.util.*;

public class Main {


     void moveZeros(int[] nums){

        int n = nums.length;
        int index = 0;

        for(int i = 0; i < n; i++) {
           
            if(nums[i] != 0){
                if(index != i){             //To skip non zero array or skip when element is in correct position
                    int temp = nums[index];
                    nums[index] = nums[i];
                    nums[i] = temp;
                }
                index++;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        Main moveZero = new Main();
        

        moveZero.moveZeros(nums);
        // System.out.println(Arrays.toString(nums));

        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}
