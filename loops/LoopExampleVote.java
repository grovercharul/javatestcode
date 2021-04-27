package loops;
import java.util.Scanner;
//Get age of person and tell whether person is eligible for 
//voting or not.
//eligible: 18 to 100
//yes, you are eligible
//age between 0 to <18
	//Hey kidy, play and enjoy game
//age negative or more than 100
//this is not a valide age... please try next time with valid age

public class LoopExampleVote {
private int age;
public void validAge() {
	Scanner sc=new Scanner(System.in);
	int reply=1;
	while (reply!=0) {
		System.out.println("enter 1 to check voter eligibilty,0 for exit");
		reply=sc.nextInt();
		if (reply==1) {
			System.out.println("enter your age:");
			age=sc.nextInt();
			if (age>=0 && age<18)
			System.out.println("go and play");
			else if (age>=18 && age<=100)
			System.out.println("yes you are eligible for vote");
			else 
				System.out.println("invalid age,try again");
			
		}
		else {
	    System.out.println("terminating application");
		}
	}
		
	}
	
	

	public static void main(String[] args) {
		LoopExampleVote object=new LoopExampleVote();
		object.validAge();
		

	}

}
