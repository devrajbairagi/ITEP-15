import java.util.Scanner;
class Question18 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      System.out.print("Enter Physics mark : ");
       int physics = sc.nextInt();
       System.out.print("Enter Chemistry mark : ");
       int chemistry = sc.nextInt();
       System.out.print("Enter Math mark : ");
       int math = sc.nextInt();
       System.out.print("Enter English mark : ");
       int english = sc.nextInt();
       System.out.print("Enter Hindi mark : ");
       int hindi = sc.nextInt();
       float percentage = (physics+chemistry+math+english+hindi)/5;
       System.out.print("Percentage of student is "+percentage);
    }
}
