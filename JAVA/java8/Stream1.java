package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {
	public static void main(String args[]) {
		List<String> str=new ArrayList<>();
		
		str.add("Vishnu");
		str.add("Raja");
		str.add("Sai");
		
		Predicate sp=s->s.equals("Vishnu");
		Stream sr = str.stream().filter(sp);
		System.out.println(sr.collect(Collectors.toList()));
	}
}
