package ArrayAndArrayList.BinarySearch;

import java.util.Scanner;

public class BinarySearch {

    static boolean binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(key > arr[mid]) {
                start = mid + 1;
            } else if(key < arr[mid]) {
                end = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 4, 6, 9, 12, 18, 21, 45, 101, 500};
        int key = sc.nextInt();

        String ans = binarySearch(arr, key) ? "Founded" : "Not found";

        System.out.println(ans);
        sc.close();
    }
}   
