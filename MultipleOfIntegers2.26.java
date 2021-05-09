import java.util.Scanner;

public class MultipleOfIntegers
{
public static void main(String... args){

Scanner input= new Scanner(System.in);

int firstInteger;
int secondInteger;

System.out.print("Kindly enter Second integer: ");

secondInteger = input.nextInt();

System.out.print("Kindly enter First integer: ");

firstInteger = input.nextInt();


if(secondInteger%firstInteger==0)
System.out.println(firstInteger +" is a multiple of "+ secondInteger);

if(secondInteger%firstInteger!=0)
System.out.println(firstInteger +" is not a multiple of "+ secondInteger);


}



}