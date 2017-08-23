public class IntegerDivision {

	public static void main(String[] args) {
		if(args.length<2){
			System.out.print("2 inputs were not supplied");
			return;
		}
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			if(b==0){
				System.out.println("Attempted to divide by zero");
				return;
			}
			System.out.println("Quotient="+(a/b));
		}catch(NumberFormatException e){
			System.out.println("A non-integer input was given");
		}
	}
}
