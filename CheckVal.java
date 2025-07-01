import java.util.Scanner;
class CheckVal
{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.print("Enter a number:");
double number=input.nextDouble();
if(number>0){
System.out.println("It is a positive number");
}
else if(number<0){
System.out.println("It is a negative number");
}
else{
System.out.println("Zero");
}
}
}