import java.util.Scanner;
public class CalculateMeterReading
{
	
	public static void main(String[] args)
	{

		Scanner scanner = new Scanner(System.in);
		String input1 = scanner.next();
		String input2 = scanner.next();
		System.out.println(calculateElectricityBill(input1,input2));
	
	}

public static int calculateElectricityBill(String input1, String input2) 

	{ 
	
		int reading1 = Integer.parseInt(input1.substring(5));
		int reading2 = Integer.parseInt(input2.substring(5));
		return (reading2-reading1)*4;
	
	}
}