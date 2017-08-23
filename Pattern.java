import java.util.Scanner;

/*
     Complete the printPattern method to enter a number and display the pattern as shown below .
     
     Input : 7
     
     Output : 
     
		*
		**
		***
		****
		*****
		******
		*******
		******
		*****
		****
		***
		**
		*

*/


public class Pattern1 {

	public static void printPattern(int n)
	{

		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				System.out.print('*');
			}
			System.out.println();
		}
		for(int i=n-2;i>=0;i--){
			for(int j=0;j<=i;j++){
				System.out.print('*');
			}
			System.out.println();
		}

	}

    public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	
		printPattern(n);
    	
    } // end of main

	
} // end of class

