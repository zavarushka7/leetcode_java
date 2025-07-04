import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
class Solution {
    public boolean hasDuplicate1(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++){
            if (nums[i-1] == nums[i]){
                return true;
            }
        }
        return false;
    
    }

    public boolean hasDuplicate2(int[] nums){
        Set<Integer> n = new HashSet<>();
        for (int num : nums){
            if (n.contains(num) == true){
                return true;
            }
            n.add(num);
        }
        return false;
    }

    public boolean hasDuplicate3(int[] nums){
        return Arrays.stream(nums).distinct().count() < nums.length;
    }
    public static void main(String[] args){
    Solution solution = new Solution();
    int[] nums = {1, 2, 3, 3};
    System.out.println(solution.hasDuplicate3(nums));
}
}

