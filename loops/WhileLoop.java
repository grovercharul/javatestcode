package loops;
import java.util.Scanner;
//WAP to get number as long as user want and passing non zero. Finally display all positive and negative numbers.
public class WhileLoop {
	

	public static void main(String[] args) {
		int num=1,pos=0,neg=0;
		Scanner sc=new Scanner(System.in);
		while(num!=0){
			System.out.println("enter any number");
		 num=sc.nextInt();
			if(num>0)
				pos++;
			else if(num<0)
				neg++;
			else
				System.out.println("you entered 0 therefore program terminated...");
		}
			
		System.out.println("positive numbers are :"+pos);
		System.out.println("Negative numbers are :"+neg);


	}

}
