import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortTheList {

	public List<String> sort(String input) {
		// Student code begins here
		

		List<String> list1 = new ArrayList<String>();
		
		if(input==null)
			return list1;
		
		for(String s:input.split(" "))
			list1.add(s);
		
		Collections.sort(list1, new Comparator<String>() {
			public int compare(String s1,String s2) {
				if(s1.length()<s2.length())
					return -1;
				else if(s1.length()>s2.length())
					return 1;
				else
					return s1.compareTo(s2);
				
			};
		});
		

		return list1;

	}

	public void printSorted(String input) {
		System.out.println(sort(input));
	}

	public static void main(String[] args) {
		String input = "";
		
		for (int i = 0; i < args.length; i++) {
			input += args[i] + " ";
		}
		input = input.trim();
		
		if(input.equals("null")){
			input = null;
		}
		SortTheList obj = new SortTheList();
		obj.printSorted(input);
	}
}