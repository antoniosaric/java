package javahacker;

import java.util.HashMap;
import java.util.Map;

public class mycollectionHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map =new HashMap<Integer, String>();
		map.put(1, "mark");
		map.put(4, "sam");
		map.put(5555, "edqin");
		System.err.println(map.get(1));
		for (Map.Entry m:map.entrySet()){
			System.err.println("Key" + m.getKey() + ", value:" + m.getValue());
		}
		map.put(1, "gregggory");
		System.out.println(map.get(1));
		
		

	}

}
