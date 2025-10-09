import java.util.Scanner;
class Question14
{
   public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
      System.out.print("Enter the percentage : ");
     int percentage = sc.nextInt();
     if(percentage>90) System.out.println("A");
     else if(percentage>80 && percentage<=90) System.out.println("B");
     else if(percentage>=60 && percentage<=80) System.out.println("C");
     else if(percentage<60) System.out.println("D");
  }

}