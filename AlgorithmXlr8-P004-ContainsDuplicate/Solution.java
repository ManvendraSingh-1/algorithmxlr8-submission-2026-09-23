import java.util.*;

public class Main {

    public static boolean duplicate(int[] nums){

        int n = nums.length;
        Arrays.sort(nums);


        for(int i = 1; i < n; i++){          //start with one 
          if(nums[i] == nums[i - 1 ]) return true;
        }


        return false;
    }
 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        System.out.println(duplicate(nums));
       

    }
}
