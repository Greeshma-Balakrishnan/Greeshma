public class SumAndAverageOfInputs {

	public static void main(String[] args) {
		if(args.length==0){
			System.out.println("NO INPUT");
			return;
		}
		int n=0;
		try{
			n = Integer.parseInt(args[0]);
		}
		catch(NumberFormatException e){
			System.out.println("FIRST ARGUMENT SHOULD BE INT");
			return;
		}
		if(n<=0){
			System.out.println("FIRST ARGUMENT SHOULD BE >0");
			return;
		}
		if(args.length!=(n+1)){
			System.out.println("INSUFFICIENT INPUTS");
			return;
		}
		int non=0,num=0;
		float sum=0;
		for(int i=1;i<args.length;i++){
			try{
				int t = Integer.parseInt(args[i]);
				sum+=t;
				num++;
			}
			catch(NumberFormatException e){
				non++;
			}
		}

		System.out.println("THE SUM IS "+sum+"\nTHE AVERAGE IS "+(sum/num)+"\nNUMERICAL INPUTS "+num+"\nNON NUMERICAL INPUTS "+non);



	}
}
