
import java.util.Scanner;

public class SquaresofEvenDigits {
	public static int sumOfSquaresOfEvenDigits(int n){
		int sum = 0;
		while(n>0){
			int d = n%10;
			if(d%2==0)
				sum+=d*d;
			n/=10;
		}

		return sum;
		
	}

	public static void main(String[] args) {
		
		//write program logic here


		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(sumOfSquaresOfEvenDigits(n));
		
	}
}
