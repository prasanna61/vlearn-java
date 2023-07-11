public class TwoSum {

    public int[] twoSum(int[] nums, int target_sum) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target_sum) {
                    return new int[] {nums[i],nums[j]};
                }

            }
        }
        throw new IllegalArgumentException("Could not find");
    }

    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int target = 6;
        int[] result = obj.twoSum(nums, target);
        System.out.println("numbers that add upto the target sum are");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
