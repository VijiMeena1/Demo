//14)Find the sum of odd numbers between 1 to 100 
//For Loop:

/*class OddNum
{
public static void main(String[] args){
int sum=0;
for(int a=1;a<=100;a++){
if(a%2==1){
sum+=a;
System.out.println(a);
}}
System.out.println("sum of Oddnum"+sum);
}
}*/

//While Loop://2600

/*class OddNum
{
public static void main(String[] args){
int a=1;
int sum=0;
while(a<=100){
if(a%2==1){
sum+=a;
System.out.println(a);
}
a++;
}
System.out.println("sum Of OddNum"+sum);
}
}*/


//Do while Loop:
class OddNum
{
public static void main(String[] args){
int a=1;
int sum=0;

do{
if(a %2==1){
sum+=a;
System.out.println(a);
}
a++;
}
while(a<=100);
System.out.println("sum of Odd numbers:"+ sum);
}
}