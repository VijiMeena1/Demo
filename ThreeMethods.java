import java.util.Scanner;
 
class ThreeMethods
{
public void average(int a,int b,int c)  //First method
{
int d=(a+b+c)/3;
System.out.println("Average:"+d);
}

public void oddoreven(int a,int b,int c)//second method
{
if(a%2==0){
System.out.println(a+":is a Even number");
}
else{
System.out.println(a+":is a odd number");
}
if(b%2==0){
System.out.println(b+":is a Even number");
}
else{
System.out.println(b+":is a odd number");
}
if(c%2==0){
System.out.println(c+":is a Even number");
}
else{
System.out.println(c+":is a odd number");
}
}

public void range(int start,int end)
{
System.out.println("Range:");
for(int a=start;a<=end;a++){
}
for(int a=start;a<=end;a++){
System.out.println(a);
}
}

public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.println("Enter a 3 numbers:");
int a =input.nextInt();
int b=input.nextInt();
int c =input.nextInt();



ThreeMethods pro=new ThreeMethods();                         //class name objectname=new class name();

pro.average(a,b,c);
pro.oddoreven(a,b,c);                                               //object name .method name( give value);
pro.range(a,b);
}
} 