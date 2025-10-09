import java.util.*;
class Question54 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        for (int i = a; i <= b; i++) {
            int temp = i, sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (sum % 9 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}