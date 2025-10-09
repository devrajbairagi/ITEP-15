import java.util.*;
class Question24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= n; i++) {
            sum1 += i;
            if (i % 2 == 0) {
                sum2 -= i;
            } else {
                sum2 += i;
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}