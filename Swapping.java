import java.util.*;
class Swapping
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the first number x:");
int x=sc.nextInt();
System.out.println("enter the second number y:");
int y=sc.nextInt();
System.out.println("before swapping:");
System.out.println("x="+x);
System.out.println("y="+y);
int temp=x;
x=y;
y=temp;
System.out.println("after swapping:");
System.out.println("x="+x);
System.out.println("y="+y);
}
}