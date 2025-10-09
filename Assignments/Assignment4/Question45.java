import java.util.*;
class Question45 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int cntEven = 0, cntOdd = 0, m = n;
        while (m > 0) {
            int d = m % 10;
            if (d % 2 == 0) cntEven++; else cntOdd++;
            m /= 10;
        }
        System.out.println("even=" + cntEven + " odd=" + cntOdd);
    }
}