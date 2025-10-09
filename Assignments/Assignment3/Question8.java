import java.util.*;
class Question8
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a=1,b=2;
System.out.print(a+" "+b+" ");
for(int i=3;i<=n;i++)
{
if(i%2==0)
{
b=b*b;System.out.print(b+" ");
}
else
{
a=a*b;System.out.print(a+" ");
}
}
}
}