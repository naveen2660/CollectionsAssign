package collec6;
import java.util.TreeMap;
public class Colletion1 {

	public static void main(String[] args) {
		TreeMap<Long,String> map=new TreeMap<Long,String>();
		
		map.put((long)111, "Naveen");
		map.put((long) 112, "Sai");
		map.put((long) 113, "...");
		
		
		System.out.println("all the keys: "+map.keySet());
		System.out.println("all the values: "+map.values());
		System.out.println("all key-value pairs: "+map.keySet()+map.values());
		System.out.println("descendingMap: "+map.descendingMap());
		
	}
	
	
}


		

		

		

