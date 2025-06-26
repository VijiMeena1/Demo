import java.util.Scanner;
class CheckNum2
{
public static void main(String[] args){
Scanner num=new Scanner(System.in);
   System.out.println("Enter a number:");
int value=num.nextInt();

   if(value %2==0){
   System.out.println("This is Even number");
   }
   else{
   System.out.println("This is odd number");
   }
   }
   }