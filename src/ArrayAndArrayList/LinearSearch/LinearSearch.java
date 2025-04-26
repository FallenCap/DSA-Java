package ArrayAndArrayList.LinearSearch;

import java.util.Scanner;

public class LinearSearch {

    static  boolean linearSearch(int[] arr, int key) {
        for (int j : arr) {
            if (j == key) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 5, 8, 2, 12, 0};
        int key = sc.nextInt();

        String ans = linearSearch(arr, key) ? "Founded" : "Not found";

        System.out.println(ans);
        sc.close();

    }
}