
import java.util.Scanner;

 public class FiveInteger{

   public static void main(String... args){

    Scanner input = new Scanner(System.in);

   int number1;
   int number2;
   int number3;
   int number4;
   int number5;
   
  System.out.print("Enter number1: ");
  number1 = input.nextInt();
 
  System.out.print("Enter number2: ");
  number2 = input.nextInt();
  
  System.out.print("Enter number3: ");
  number3 = input.nextInt();

  System.out.print("Enter number4: ");
  number4 = input.nextInt();

  System.out.print("Enter number5: ");
  number5 = input.nextInt();
   int largerOfFirstAndSecond = 0;
   int largerOfThirdAndForth = 0;
  int largerOfFirstSecondThirdForth = 0;
     int largest = 0;

       if(number1>number2)
      largerOfFirstAndSecond = number1;
     if(number2>number1)
    largerOfFirstAndSecond = number2;
     if(number3>number4)
       largerOfThirdAndForth = number3;
     if(number4>number3)
      largerOfThirdAndForth = number4;

    if(largerOfThirdAndForth>largerOfFirstAndSecond)
	largerOfFirstSecondThirdForth = largerOfThirdAndForth;

    if(largerOfFirstAndSecond>largerOfThirdAndForth)
      largerOfFirstSecondThirdForth = largerOfFirstAndSecond;

    if(largerOfFirstSecondThirdForth>number5)
      largest = largerOfFirstSecondThirdForth;

    if(number5>largerOfFirstSecondThirdForth)
       largest = number5;
   
   System.out.printf("largest number = %d",largest);

        int smallerOfFirstAndSecond = 0;
	int smallerOfThirdAndForth = 0;
	int smallerOfFirstSecondThirdForth = 0;
	 int smallest = 0;


if(number1<number2){ 
smallerOfFirstAndSecond = number1;
}
if(number2<number1){
smallerOfFirstAndSecond = number2;
}
if(number3<number4){
smallerOfThirdAndForth = number3;
}
if(number4<number3){
smallerOfThirdAndForth = number4;
}

	if(smallerOfThirdAndForth<smallerOfFirstAndSecond)
	    smallerOfFirstSecondThirdForth = smallerOfThirdAndForth;
	
	if(smallerOfFirstAndSecond<smallerOfThirdAndForth)
	   smallerOfFirstSecondThirdForth = smallerOfThirdAndForth;

	if(smallerOfFirstSecondThirdForth<number5)
	   smallest = smallerOfFirstSecondThirdForth;

	if(number5<smallerOfFirstSecondThirdForth)
	 smallest = number5;

System.out.printf("smallest number = %d", smallest);
}
}
	




















































