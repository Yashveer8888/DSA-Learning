package LeetCode;

public class SubsetXORSum {
    public static int subsetXORSum(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total |= num;
        }
        return total * (1 << (nums.length - 1));
    }

    public static void main(String[] args) {
        int[] arr = {1,3};
        int ans = subsetXORSum(arr);
        System.out.println(ans);

    }
}