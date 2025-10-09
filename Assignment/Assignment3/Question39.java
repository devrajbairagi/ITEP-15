import java.util.Scanner;
class Question39 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter amount: ");
        int amount=sc.nextInt();
        int n2000=amount/2000;amount%=2000;
        int n500=amount/500;amount%=500;
        int n200=amount/200;amount%=200;
        int n100=amount/100;amount%=100;
        int n50=amount/50;amount%=50;
        int n20=amount/20;amount%=20;
        int n10=amount/10;amount%=10;
        System.out.println("2000:"+n2000+" 500:"+n500+" 200:"+n200+" 100:"+n100+" 50:"+n50+" 20:"+n20+" 10:"+n10);
    }
}