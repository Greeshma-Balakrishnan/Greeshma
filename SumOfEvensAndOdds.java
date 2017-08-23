import java.util.Arrays;


public class SumOfEvensAndOdds {
	
	//Function 
	public int[] getSumOfEvensAndOdds(int[] input) {
		// Student code begins here
		int x[] = new int[2];

		for(int in:input){
			if(in%2==0)
				x[0]+=in;
			else
				x[1]+=in;
		}
		
		return x;
		
		// Student code ends here
	}

	public void printSumOfEvensAndOdds(int[] input) {
		System.out.println(Arrays.toString(getSumOfEvensAndOdds(input)));
	}

	public static void main(String[] args) {

		try {
			int[] input = new int[args.length];
			for (int i = 0; i < input.length; i++) {
				input[i] = Integer.parseInt(args[i]);
			}

			SumOfEvensAndOdds obj = new SumOfEvensAndOdds();
			obj.printSumOfEvensAndOdds(input);
		} catch (NumberFormatException e) {
			System.out.println("Only numbers are allowed.");
		}

	}
}
