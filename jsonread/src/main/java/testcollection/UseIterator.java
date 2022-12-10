package testcollection;

import java.util.ArrayList;
import java.util.Iterator;

public class UseIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> list01= new ArrayList<String>();
		list01.add("abc");
		list01.add("check1");
		
		
		Iterator itr01=list01.iterator();
		
		while(itr01.hasNext()) {
			System.out.println(itr01.next());
		}
	}
}
