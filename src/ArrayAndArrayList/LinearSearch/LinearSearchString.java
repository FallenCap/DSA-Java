package ArrayAndArrayList.LinearSearch;

import java.util.Scanner;

public class LinearSearchString {

    static boolean linearSearchString(String str, char key) {
        for(int i = 0; i < str.length(); i++) {
            if(key == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "Subham";

        char key = sc.next().charAt(0);

        String ans = linearSearchString(str, key) ? "Founded" : "Not found";
        System.out.println(ans);
        sc.close();
    }
}
