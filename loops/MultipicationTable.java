package loops;
//WAP to get a number and print its table
public class MultipicationTable {
	public static void main(String[] args) {
		int num = 5;
		for(int i = 1; i <= 20; ++i)
		{
			System.out.printf("%d * %d = %d \n", num, i, num * i);
		}
	}	

}


