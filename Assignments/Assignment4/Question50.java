import java.util.*;
class Question50 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int dec = 0, base = 1;
        while (n > 0) {
            dec += (n % 10) * base;
            base *= 2;
            n /= 10;
        }
        System.out.println(dec);
    }
}