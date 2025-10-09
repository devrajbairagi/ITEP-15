import java.util.*;
class Question82 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        for (int y = a; y <= b; y++) {
            boolean leap = (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
            if (leap) System.out.print(y + " ");
        }
    }
}