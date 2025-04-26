package ArrayAndArrayList.BinarySearch;

import java.util.Scanner;

public class FloorNumber {
    static int floorNumber(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int floor = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= key) {
                floor = arr[mid];
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return floor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 4, 6, 9, 12, 18, 21, 45, 101, 500 };
        int key = sc.nextInt();

        System.out.println("Floor Number: " + floorNumber(arr, key));
        sc.close();
    }
}
