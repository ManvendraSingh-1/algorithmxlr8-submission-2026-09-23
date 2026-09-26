import java.util.*;

public class Main {

    public static int majorityElements(int[] nums){

        int n = nums.length;
        Map<Integer,Integer> count = new HashMap<>();

        for(int num: nums){
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer,Integer> counts: count.entrySet()){
            if(counts.getValue() > n / 2) return counts.getKey();
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        int MajorityELement = majorityElements(nums);
        System.out.println(MajorityELement);
    }
}
