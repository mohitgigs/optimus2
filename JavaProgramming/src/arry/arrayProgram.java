package arry;
import java.util.*;
import java.lang.*;

public class arrayProgram {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub\
		int sum=0;
		System.out.println("Enter the size of the array");
		Scanner sc = new Scanner(System.in);
		int size =  Integer.parseInt(sc.nextLine());
		//String k = System.console().readLine();
		int[] arr = new int[size];
		System.out.println("Enter the numbers");
		for(int i=0;i<size;i++)
        {
            arr[i] = Integer.parseInt(sc.nextLine());
        }
		for(int i=0;i<size;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum is "+sum);
		int lastTerm = arr[size- 1];
        int firstTerm = arr[0];
        sum = 0;
        sum = sum+(size * (firstTerm + lastTerm)) / 2;
        System.out.println("Sum os series is " + sum);
		
//		System.console().reader();

	}

}
