import java.util.*;
class Question53 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp = n, sum = 0;
        while (temp > 0) {
            int d = temp % 10;
            int p = 1;
            for (int i = 1; i <= 3; i++) p *= d;
            sum += p;
            temp /= 10;
        }
        System.out.println(sum == n ? "armstrong" : "not armstrong");
    }
}