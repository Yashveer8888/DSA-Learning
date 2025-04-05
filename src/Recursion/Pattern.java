package Recursion;

public class Pattern { 
    public static void patten(int n) {
        if (n == 0) return;
        patten(n - 1);
        InnerPattern(n);
        System.out.println();
    }

    public static void InnerPattern(int n) {
        if (n == 0) return;
        System.out.print("* ");
        InnerPattern(n - 1);
    }

    public static void main(String[] args) {
        int n = 5; 
        patten(n);
    }
}
