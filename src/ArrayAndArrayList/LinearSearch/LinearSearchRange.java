package ArrayAndArrayList.LinearSearch;

import java.util.Scanner;

public class LinearSearchRange {

    static boolean linearSearchRange(int[] arr, int key, int start, int end) {
        for(int i  = start; i < end; i++) {
            if(arr[i] == key) {
                return true;
            }
        }
         return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 5, 8, 2, 12, 0};

        int start = sc.nextInt();
        int end = sc.nextInt();
        int key = sc.nextInt();

        String ans = linearSearchRange(arr, key, start, end) ? "Founded" : "Not found";
        System.out.println(ans);
        sc.close();
    }
}

