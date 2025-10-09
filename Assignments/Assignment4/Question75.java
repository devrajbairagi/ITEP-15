import java.util.*;
class Question75 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        for (int i = a; i <= b; i++) {
            int temp = i, rev = 0;
            while (temp > 0) {
                rev = rev * 10 + temp % 10;
                temp /= 10;
            }
            System.out.print(rev + " ");
        }
    }
}