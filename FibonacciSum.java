import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciSum {

public static int getSumOfNfibos(int n){

	int f =0,s=1,sum=1;

	for(int i=2;i<n;i++){
		int t = f+s;
		sum+=t;
		f = s;
		s = t;
	}

	return sum;
}

public static void main(String[] args) {

	//fill your code here
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(getSumOfNfibos(n));
}
}