import java.util.Scanner;
class Question8
{
   public static void main(String args[])
   { 
    Scanner sc = new Scanner(System.in);
      System.out.println("Enter the total number of classes held : ");
      int held = sc.nextInt();
      System.out.println("Enter the total number of classes attended : ");
      int attended = sc.nextInt();
      System.out.println(held);
      System.out.println(attended);
     float percentage = 0.0f;
     percentage = (attended/held)*100;
      //System.out.println(percentage*100);
     String output = (percentage>75) ? "This student is allowed to sit in exam" : "This student is not allowed to sit in exam";
     System.out.println(output);
     System.out.println("Is this student has medical cause or not : ('Y' or 'N')");
     char cause;
      cause = sc.next().charAt(0);
      if(percentage<75 || cause == 'Y' || cause =='y') System.out.println("This student is allowed to sit in exam");
      else if(percentage > 75 && cause == 'N' || cause == 'n') System.out.println("This student is allowed to sit in exam");
      else if(cause == 'N' || cause =='n') System.out.println("This student is allowed to sit in exam");

   }
}