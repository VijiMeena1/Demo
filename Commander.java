import java.util.Scanner;
class Agni                                                   //1st class name
{
static void Method1(int a,int b)                           //1 static method using keyword
{
int c=a+b;
int range=c/2;                                
System.out.println("Range:"+range);
} 
void Type()                                         //2 Non Static method
{
System.out.println("This is java Non static Method");
}
static void Trigger()	                                   //3 static method
{
System.out.println("This is java Static Method");
}
void Intercept()                                           //4 Non Static method
{
System.out.println("This is java non Static method");
}
}

class Brahmos                                    //2nd class name
{    
 static void range() {
   System.out.println("Brahmos Range");
    }

 void type() {
        System.out.println("Brahmos");
    }

 static void trigger() {
        System.out.println("Brahmos Triggered");
    }

 void intercept() {
        System.out.println("Brahmos Intercepting Target...");
    }
}

public class Commander
 {
public static void main(String[] args){

Scanner input=new Scanner(System.in);
System.out.println("Enter value:");
int a=input.nextInt();
int b=input.nextInt();

Agni obj=new Agni();
Brahmos obj1=new Brahmos();

Agni.Method1(a,b);
obj.Type();
Agni.Trigger();
obj.Intercept();

Brahmos.range();
obj1.type();
Brahmos.trigger();
obj1.intercept();
}
}


