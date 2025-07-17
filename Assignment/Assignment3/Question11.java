import java.util.Scanner;
class Question11
{
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter your age : ");
     int age = sc.nextInt();
     System.out.println("Enter your sex : (M or F)");
     char sex = sc.next().charAt(0);
     System.out.println("Enter your marital status : (Y or N) ");
     char maritalStatus = sc.next().charAt(0);
     if(sex=='f' || sex == 'F') System.out.println("She will work in urban areas only.");
     else if((sex == 'm' || sex=='M') && (age >= 20 && age<=40)) System.out.println("He may work in anywhere");
      else if((sex == 'm' || sex=='M') && (age > 40 && age<=60)) System.out.println("He will work in urban areas only ");
   else System.out.println("ERROR....");
   }
}