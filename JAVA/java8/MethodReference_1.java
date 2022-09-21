package methodReference;

import java.util.ArrayList;
import java.util.List;

public class MethodReference_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List names=new ArrayList();
		
		names.add("Mahesh");
		names.add("suresh");
		names.add("Ramesh");
		names.add("Naresh");
		names.add("Kalpesh");
		
		names.forEach(System.out::println);
		

	}

}
