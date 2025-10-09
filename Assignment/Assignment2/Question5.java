import java.util.Scanner;
class Question5
{
  public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the first person age : ");
     int firstPersonAge = sc.nextInt();
     System.out.println("Enter the second person age :");
     int secondPersonAge = sc.nextInt();
     System.out.println("Enter the third person age :");
     int thirdPersonAge = sc.nextInt();
      if(firstPersonAge > secondPersonAge && secondPersonAge > thirdPersonAge) 
      System.out.println("First person is the oldest one with age "+firstPersonAge);
      else if(secondPersonAge > firstPersonAge && firstPersonAge > thirdPersonAge)
       System.out.println("Second person is the oldest one with age "+secondPersonAge);
     else if(thirdPersonAge > firstPersonAge && firstPersonAge > secondPersonAge)System.out.println("Third person is the oldest one with age "+thirdPersonAge);

     if(firstPersonAge < secondPersonAge && secondPersonAge < thirdPersonAge) 
      System.out.println("First person is the youngest one with age "+firstPersonAge);
      else if(secondPersonAge < firstPersonAge && firstPersonAge < thirdPersonAge)
       System.out.println("Second person is the youngest one with age "+secondPersonAge);
     else  if(thirdPersonAge < firstPersonAge && firstPersonAge < secondPersonAge)System.out.println("Third person is the youngest one with age "+thirdPersonAge);
 
   
  }
}