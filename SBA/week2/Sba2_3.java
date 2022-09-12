package sba2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Sba2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> eid=new ArrayList<>();
		for(int i=800;i<=820;i++) {
			eid.add(i);
		}
		System.out.println("Employee Nos:");
		Iterator itr=eid.iterator();
		while(itr.hasNext())
			System.out.println(itr.next()+" ");
		
	}

}
