/*Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return. */

package ArrayAndArrayList.BinarySearch;

public class KokoEatingBanana {
    static int minEatingSpeed(int[] piles, int h) {
        int start = 1, end = findMax(piles);
        int minAmt = end;
        while(start <= end) {
            int mid = start + (end - start)/2;
            int totalTime = getTotalTime(piles, mid);
            if(totalTime < h) {
                minAmt = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return minAmt;
    }
    static int getTotalTime(int[] piles, int amount) {
        int totalTime = 0;

        for(int p: piles) {
            totalTime += Math.ceil(p/amount);
        }
        return totalTime;
    }

    static int findMax(int[] piles) {
        int max = Integer.MIN_VALUE;
        for(int p: piles) {
            max = Math.max(p, max);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;

        System.out.println(minEatingSpeed(piles, h));
    }

}
