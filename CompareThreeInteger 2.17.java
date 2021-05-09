import java.util.Scanner;

public class CompareThreeInteger{

public static void main(String... args){

int firstInteger;
int secondInteger;
int thirdInteger;
int sum;
int average;
int product;

Scanner input = new Scanner(System.in);
 
System.out.print("enter firstInteger");
firstInteger = input.nextInt();

System.out.print("enter secondInteger");
secondInteger = input.nextInt();

System.out.print("enter thirdInteger");
thirdInteger = input.nextInt();

sum = firstInteger + secondInteger + thirdInteger;

System.out.printf("sum is %d%n", sum);
 
average = (firstInteger + secondInteger + thirdInteger)/3;
System.out.printf("average is %d%n", average); 

product = firstInteger * secondInteger * thirdInteger;
System.out.printf("product is %d%n", product);

if(firstInteger > secondInteger)
	if(firstInteger > thirdInteger)
		System.out.printf("%d is largest", firstInteger);

if(secondInteger > firstInteger)
	if(secondInteger > thirdInteger)
		System.out.printf("%d is largest", secondInteger);

if(thirdInteger > firstInteger)
	if(thirdInteger > secondInteger)
System.out.printf("%d is largest", thirdInteger);

if(firstInteger < secondInteger)
	if(firstInteger < thirdInteger)
 System.out.printf("%n%d is smallest", firstInteger);

if(secondInteger < firstInteger)
	if(secondInteger < thirdInteger)
System.out.printf("%n%d is smallest", secondInteger);

if(thirdInteger < firstInteger)
	if(thirdInteger < secondInteger)
System.out.printf("%n%d is smallest", thirdInteger);










 















}
}