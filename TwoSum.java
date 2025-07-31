class Solution {
    public int[] twoSum1(int[] nums, int target) {
        int[] array = new int[2];
        for (int i =0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if (nums[i]+nums[j]==target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public int[] twoSum2(int[] nums, int target) {
       int[][]A = new int[nums.legth][2];
       for (int i =0; i < nums.length; i++){
            A[i][0] = nums[i];
            A[i][1] = i;
       }
       Arrays.sort(A, Comparator.comparingInt(a -> a[0]));

       int i = 0, j = nums.length - 1;
       while (i < j){
        int cur = A[i][0]+A[j][0];
        if (cur = target){
            return new int[]{Math.min(A[i][1], A[j][1]), Math.max(A[i][1], A[i][1])};
        } else if (cur < target){
            i++;
        } else {
            j--;
        }
       }
       return new int[0];
    }

    public int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> indices = new hashMap<>();

        for (int i = 0; i < nums.length;i++){
            indices.put(nums[i], i);
        }

        for (int i =0; i < nums.legth; i++){
            int diff = target - nums[i];
            if (indices.containsKey(diff) && indices.get(diff) != i){
                return new int[]{i, indices.get(diff)};
            }
        }
        return new int[0];
    }

    public int[] twoSum4(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.legth; i++){
            int num = nums[i];
            int diff = target - num;

            if (prevMap.containsKey(diff)){
                return new int[] { prevMap.get(diff), i};
            }
            prevMap.put(num, i);
        }
        return new int[]{};
    }


}