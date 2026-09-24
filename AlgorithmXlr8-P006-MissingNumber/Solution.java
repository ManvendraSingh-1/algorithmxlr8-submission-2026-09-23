import java.util.*;

public class Main {


    public static int missingNumber(int[] nums){

        int n = nums.length;
        int sum = n * (n + 1)/2;
        int result = 0;
        for(int num: nums) result += num;
        return sum - result;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        int missingNum = missingNumber(nums);
        System.out.println(missingNum);
    }
}
