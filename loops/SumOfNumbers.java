package loops;
import java.util.Scanner;
//WAP to get any n numbers from user, find out sum of 
//all n entered numbers
public class SumOfNumbers {
public static void main(String[] args) {
		System.out.println("Enter a number=");
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int temp =n; 
		int sum=0;
		while(n>0)
		{
			int z = n%10;
			sum= sum+ z;
			n=n/10;
		}
		System.out.println("Sum="+sum );
	}
}

