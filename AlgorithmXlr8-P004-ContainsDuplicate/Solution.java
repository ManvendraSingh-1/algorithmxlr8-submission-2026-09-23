import java.util.*;

public class Main {

    public static boolean duplicate(int[] nums){

        int n = nums.length;
       
        Set<Integer> set = new HashSet<>();

        for(int num: nums){
          
          if(set.contains(num)){
            return true;
          }
          set.add(num);

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
