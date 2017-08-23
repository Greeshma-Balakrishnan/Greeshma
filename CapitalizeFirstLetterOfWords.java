public class CapitalizeFirstLetterOfWords {
	//Function
	public String capitalize(String input) {
		// Student code begins here
			String[] words = input.split(" ");
		for(int i=0;i<words.length;i++){
			words[i] = words[i].substring(0, 1).toUpperCase()+words[i].substring(1).toLowerCase();
		}
		StringBuffer sb = new StringBuffer(words[0]);
		for(int i=1;i<words.length;i++){
			sb.append(' ');
			sb.append(words[i]);
		}
			
		return sb.toString();

	}

	public void printCapitalized(String input) {
		System.out.println(capitalize(input));
	}

	public static void main(String[] args) {
		String input = "";
		for (int i = 0; i < args.length; i++) {
			input += args[i] + " ";
		}

		input = input.trim();
		CapitalizeFirstLetterOfWords obj = new CapitalizeFirstLetterOfWords();

		obj.printCapitalized(input);
	}
}
