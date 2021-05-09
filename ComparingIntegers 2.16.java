import java.util.Scanner;


public class ComparingIntegers{

public static void main(String... arg){

int firstInteger;
int secondInteger;

Scanner input = new Scanner(System.in);
 
System.out.print("user enters first integer ");
firstInteger = input.nextInt();

System.out.print("user enters second integer ");
secondInteger = input.nextInt();

if(firstInteger > secondInteger)
	System.out.printf("%d is larger", firstInteger);
if(secondInteger > firstInteger)
	System.out.printf("%d is larger", secondInteger);

if(firstInteger == secondInteger)
	System.out.printf("%d These numbers are equal", firstInteger);





}












}