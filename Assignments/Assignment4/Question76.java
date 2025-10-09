import java.util.*;
class Question76 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        for (int i = a; i <= b; i++) {
            int temp = i, sum = 0;
            int digits = 0;
            while (temp > 0) {
                int d = temp % 10;
                int fact = 1;
                for (int k = 1; k <= d; k++) fact *= k;
                sum += fact;
                temp /= 10;
            }
            if (sum == i) System.out.print(i + " ");
        }
    }
}