import java.io.*;
import java.util.Scanner;
class abc
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int count=0;
while(a>0)
{
a=a/10;
count=count+1;
}
System.out.println(count);
}
}
