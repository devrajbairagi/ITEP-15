import java.util.*;
class Question7
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a=0,b=1;
for(int i=1;i<=n;i++)
{
System.out.print(a+" ");
int c=a+b;a=b;b=c;
}
}
}