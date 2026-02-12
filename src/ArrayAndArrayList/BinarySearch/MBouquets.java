package ArrayAndArrayList.BinarySearch;

public class MBouquets {
    public static int minDays(int[] bloomDay, int m, int k) {
        int start = findMin(bloomDay), end = findMax(bloomDay), ans = -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            int bouquets = getTotalBouquets(bloomDay, k, mid);
            if(m <= bouquets) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static int getTotalBouquets(int[] bloomDay, int k, int day) {
        int counter = 0, bouquets = 0;
        for (int b : bloomDay) {
            if (b <= day) {
                counter++;
            } else {
                bouquets += (counter / k);
                counter = 0;
            }
        }
        bouquets += (counter / k);
        counter = 0;
        return bouquets;
    }

    public static int findMax(int[] bloomDay) {
        int max = Integer.MIN_VALUE;
        for (int b : bloomDay) {
            max = Math.max(b, max);
        }
        return max;
    }

    public static int findMin(int[] bloomDay) {
        int min = Integer.MAX_VALUE;
        for (int b : bloomDay) {
            min = Math.min(b, min);
        }
        return min;
    }

    public static void main(String[] args) {
        int[] bloomDay = {7, 7, 7, 7, 13, 11, 12, 7};
        int m = 2, k = 3;
        System.out.println(minDays(bloomDay, m, k));
    }
}
