package collec6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Collection3 {

	public static void main(String[] args) {
		List<String> word=new ArrayList<>();
		word.add("Hello");
		word.add("This");
		word.add("is");
		word.add("Venkata");
		word.add("Sai");
		word.add("Naveen");
		word.add("From");
		word.add("Kadapa");
		word.add(".....");
		word.add("That's It");
		word.add("!...");
		//creating HashSet and adding objects
		HashSet<String> set=new HashSet<String>(word);
		set.add("From");
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
	}

}
}