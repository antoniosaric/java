package javahacker;

import java.util.Iterator;
import java.util.LinkedList;

public class mycollectionLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ls=new LinkedList<String>();
		ls.add("mark");
		ls.add("bob");
		ls.add("sam");
		ls.add("peter");
		
		Iterator<String> itr=ls.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}

	}

}
