import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;

public class SumCommonElements {

public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++)
			a[i] = scanner.nextInt();
		int t = scanner.nextInt();
		int[] b = new int[t];
		for(int i=0;i<t;i++)
			b[i] = scanner.nextInt();
		System.out.println(UserMainCode.getSumOfIntersection(a,b));

	}	
}



class UserMainCode {

public static int getSumOfIntersection(int a[],int b[]){
		HashSet<Integer> s = new HashSet<Integer>();
		for(int el:b)
			s.add(el);
		boolean flag = false;
		int sum = 0;
		for(int el:a){
			if(s.contains(el)){
				sum+=el;
				flag = true;
			}
				
		}
		if(!flag)
			System.out.println("No common elements");
		return sum;
	}	
}
