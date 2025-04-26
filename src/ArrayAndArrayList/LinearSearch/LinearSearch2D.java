package ArrayAndArrayList.LinearSearch;

import java.util.Scanner;

public class LinearSearch2D {

    static boolean linearSearch2d(int[][] arr, int key) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == key) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int key = sc.nextInt();

        String ans = linearSearch2d(arr, key) ? "Founded" : "Not found";
        System.out.println(ans);
        sc.close();
    }
}
