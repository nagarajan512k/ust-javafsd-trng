package com.ust3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Float> m=new HashMap<>();
		m.put(1, 3.4f);
		m.put(2, 6.5f);
		m.put(3, 7.5f);
		
		Collection c=m.values();
		Iterator itr=c.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
