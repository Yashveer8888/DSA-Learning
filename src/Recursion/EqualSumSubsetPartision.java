package Recursion;

public class EqualSumSubsetPartision {
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
        int[] arr = {2,3,1,4,6};
        int n = arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        if(sum%2!=0) System.out.println(false);
        else{
            int target = sum/2;
            int ans = TargetSubset(arr, n, target);
            System.out.println(ans==1);
        }
    }
}