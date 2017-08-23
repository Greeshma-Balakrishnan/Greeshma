import java.util.Arrays;
import java.util.Scanner;
public class LargestElement {
	
	public static void main(String[] args)
	{
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++)
			a[i] = scanner.nextInt();
		System.out.println(checkLargestAmongCorner(a));
		
	}

public static int checkLargestAmongCorner(int []a)

{
	
	int l = a[0];
	if(l<a[a.length-1])
		l = a[a.length-1];
	if(l<a[a.length/2])
		l = a[a.length/2];

	return l;
}	
}