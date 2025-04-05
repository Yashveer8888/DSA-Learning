package Recursion;

public class Knapsack01bounded {
    public static int Knapsack(int[] item, int[] val, int W, int n) {
        if (n == 0 || W == 0) return 0;

        if (item[n - 1] > W) {
            return Knapsack(item, val, W, n - 1);
        } else {
            return Math.max(
                val[n - 1] + Knapsack(item, val, W - item[n - 1], n - 1),
                Knapsack(item, val, W, n - 1)
            );
        }
    }

    public static void main(String[] args) {
        int[] item = {3, 5, 4, 7};
        int[] val = {7, 8, 9, 2};
        int W = 10; 
        int n = item.length;

        int maxProfit = Knapsack(item, val, W, n);
        System.out.println("Maximum Value: " + maxProfit);
    }
}
