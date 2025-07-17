import java.util.Scanner;
class Question4
{
   public static void main(String args[])
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please Enter your grade : ");
      int grade = sc.nextInt();
      sc.close();
      if(grade>80) System.out.println("A");
      else if(grade >=60 && grade<=80) System.out.println("B");
      else if(grade>50 && grade<60) System.out.println("C");
      else if(grade >=45 && grade<=50) System.out.println("D");
      else if( grade>=25 &&  grade<45) System.out.println("E");
      else System.out.println("F");
  }
}