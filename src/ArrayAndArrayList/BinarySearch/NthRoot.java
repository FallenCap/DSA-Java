package ArrayAndArrayList.BinarySearch;

public class NthRoot {

    static int findNthRoot(int x, int n) {
        int start = 1;
        int end = x;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            double power = Math.pow(mid, n);
            if (power == (double) x) {
                return mid;
            } else if (power > (double) x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int x = 69;
        int n = 4;
        System.out.println(findNthRoot(x, n));
    }
}
