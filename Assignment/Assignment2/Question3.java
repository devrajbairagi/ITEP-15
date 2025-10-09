import java.util.Scanner;
class Question3
{

   public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter years of your services : ");
     int service = sc.nextInt();
     System.out.println("Enter your salary : ");
     float salary = sc.nextInt();
     sc.close();
     if(service>5)
     {
      salary = salary * 0.05f;
       System.out.println("Your net bonus amount is "+salary);
     }
     else System.out.println("Your amount is "+salary);
  }
}