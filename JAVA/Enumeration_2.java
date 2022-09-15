package com.ust5;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;

public class Enumeration_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String>hs=new HashSet<String>();
		hs.add("P");
		hs.add("Q");
		hs.add("R");
		Enumeration e=Collections.enumeration(hs);
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
	}

}
