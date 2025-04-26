package ArrayAndArrayList.BinarySearch;

import java.util.Scanner;

public class CeilingNumber {

    static int ceilingNumber(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int ceil = -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] >= key) {
                ceil = arr[mid];
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ceil;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 4, 6, 9, 12, 18, 21, 45, 101, 500};
        int key = sc.nextInt();

        System.out.println("Ceiling Number: " + ceilingNumber(arr, key));
        sc.close();
    }
}
