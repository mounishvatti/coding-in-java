import java.util.Scanner;
 
public class AddTwoNumbers {
public static void main(String args[]){
int a, b, sum;
Scanner sc = new Scanner(System.in);
System.out.println("Enter first number: ");
a = sc.nextInt();
System.out.println("Enter second number: ");
b = sc.nextInt();
sc.close();
sum = a + b;
System.out.print("\nSum = " + sum);
}
}