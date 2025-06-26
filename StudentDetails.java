import java.util.Scanner;

class StudentDetails
{
public static void main(String[] args){
  Scanner input=new Scanner(System.in);  //scanner input get line
  
System.out.print("Student name:");      //student name
String name=input.nextLine();

System.out.print("Roll number:");      //rollnumber
 int rollnumber=input.nextInt();
 
int sub1,sub2,sub3;//get value

System.out.print("Enter a subject1 mark1:");
 sub1=input.nextInt();

System.out.print("Enter a subject2 mark2:");
 sub2=input.nextInt();

System.out.print("Enter a subject3 mark3:");
 sub3=input.nextInt();
 
 int total=sub1+sub2+sub3;//
    float average=total/3f;
	System.out.println("Total mark:"+total);
System.out.println("Average:"+average);
if(average>40){
	System.out.println("pass");
}
else{
	System.out.println("fail");
}
//Print the grade based on average:
if(average>=90&&average<=100){
	System.out.println("Grade:S");
}
else if(average>=80&&average<=89){
	System.out.println("Grade:A");
}
else if(average>=70&&average<=79){
	System.out.println("Grade:B");
}
else if(average>=60&&average<=69){
	System.out.println("Grade:C");
}
else if(average>=50&&average<=59){
	System.out.println("Grade:D");
}

else if(average>=40&&average<=49){
	System.out.println("Grade:E");
	
}
else{
	System.out.println("Grade:fail");
}
}
}
	

