package com.ust3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> m=new HashMap<>();
		m.put(1, "R");
		m.put(2, "A");
		m.put(3, "J");
		
		Set keys=m.keySet();
		System.out.println(keys);
	}

}
