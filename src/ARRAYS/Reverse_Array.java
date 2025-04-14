package ARRAYS;

public class Reverse_Array {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,7,9};
        for(int num:arr){
            System.out.print(num+" ");
        }
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println();
        for(int num:arr){
            System.out.print(num+" ");
        }

    }
}