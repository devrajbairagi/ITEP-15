import java.util.*;
class Question72 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        for (int i = a; i <= b; i++) {
            System.out.print(i + ": ");
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}