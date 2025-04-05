package Recursion;

public class TargetSubsetProblem {
    public static int TargetSubset(int[] arr, int n, int target) {
        if (target == 0 ) return 1;
        if (n == 0) return 0;


        if (target<arr[n-1]) {
            return TargetSubset(arr, n - 1,target);
        } else {
            return ( TargetSubset(arr, n-1, target-arr[n-1]) | TargetSubset(arr, n-1, target) );
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 7};
        int target = 10; 
        int n = arr.length;

        int ans = TargetSubset(arr, n, target);
        System.out.println(ans==1);
    }
}