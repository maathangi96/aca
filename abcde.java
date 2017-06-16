import java.io.*;
import java.util.Scanner;
class abcde
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int num=s.nextInt();
int rem,sum=0,temp;
temp=num;
while(num>0)
{
rem=num%10;
sum=(sum*10)+rem;
num=num/10;
}
if(temp==sum)
{
System.out.println("palindrome");
}
else
{
System.out.println(" not a palindrome");
}
}
}

