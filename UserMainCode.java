import java.util.Scanner;


public class SumCommonElements {

public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int t = scanner.nextInt();
		int[] a = new int[n];
		int[] b = new int[t];
		for(int i=0;i<n;i++)
			a[i] = scanner.nextInt();
		for(int i=0;i<t;i++)
			b[i] = scanner.nextInt();
		System.out.println(getSumOfIntersection(a,b));

	}	
}



class UserMainCode {

public static int getSumOfIntersection(int a[],int b[])
	{
		
		//fill your code here
		return 0;
		}	
}
