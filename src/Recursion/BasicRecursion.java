package Recursion;

public class BasicRecursion {

    public static  int factorial(int n) {
        if (n == 0) return 1; 
        return n * factorial(n - 1);
    }

    public  static int fibonacci(int n) {
        if (n <= 1) return n;
        System.out.println("");
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void towerOfHanoi(int n, char from, char to, char aux) {
        if (n == 0) return;
        towerOfHanoi(n - 1, from, aux, to);
        System.out.println("Move disk " + n + " from " + from + " to " + to );
        towerOfHanoi(n - 1, aux, to, from);
    }


    public static int binarySearch(int[] arr, int left, int right, int target) {
        if (left > right) return -1; // Base case: Target not found

        int mid = left + (right - left) / 2; // Avoids overflow

        if (arr[mid] == target) return mid; // Target found
        if (arr[mid] > target) return binarySearch(arr, left, mid - 1, target); // Search left half
        
        return binarySearch(arr, mid + 1, right, target); // Search right half
    }
    
    
    
    public static void main(String[] args) {
        int n=5;
        System.out.println(factorial(n));
        System.out.println(fibonacci(n));


        int[] arr = {1, 3, 5, 7, 9, 11, 15};
        int target = 7;
        int index = binarySearch(arr, 0, arr.length - 1, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
    }
}