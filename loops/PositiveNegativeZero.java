package loops;
import java.util.Scanner;
public class PositiveNegativeZero {
public static void main(String[] args) {
		{
	        int counta=0, countb=0, countc=0, i;
	        int arr[] = new int[10];
	        Scanner sc = new Scanner(System.in);
			System.out.print("Enter 10 Numbers : ");
	        for(i=0; i<10; i++)
	        {
	            arr[i] = sc.nextInt();
	        }
	        for(i=0; i<10; i++)
	        {
	            if(arr[i] < 0)
	            {
	                countb++;
	            }
	            else if(arr[i] == 0)
	            {
	                countc++;
	            }
	            else
	            {
	                counta++;
	            }
	        }
			System.out.print(counta + " Positive Numbers");
	        System.out.print("\n" + countb + " Negative Numbers");
	        System.out.print("\n" + countc + " Zero");
	    }
	}
}


