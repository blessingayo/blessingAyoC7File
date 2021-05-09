import java.util.Scanner;

public class OddOrEvenNumber{

public static void main(String... args){

Scanner input = new Scanner(System.in);

int even;
int odd;
int number1;

System.out.print("enter determine and print whether odd or even");
 number1 = input.nextInt();

  if(number1 %2 == 0)
System.out.printf("the number is even");

if(number1 %2 != 0)
System.out.printf("the number is odd");











}
}