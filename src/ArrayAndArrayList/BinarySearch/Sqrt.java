package ArrayAndArrayList.BinarySearch;

public class Sqrt {
    static int findSqrt(int x) {
        int start = 0;
        int end = x;

        while(start <= end) {
            int mid  = start + (end - start) /2 ;
            if(Math.pow(mid, 2) == (long)x) {
                return mid;
            } else if(Math.pow(mid, 2) > (long)x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int x = 7;
        System.out.println("The squre root of the " + x + " is: " + findSqrt(x));
    }
}
