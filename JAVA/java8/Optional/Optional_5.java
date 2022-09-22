package optional;

import java.util.Optional;

public class Optional_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Optional<String> emptyOption=Optional.empty();
		Optional<String> strOption=Optional.of("one");
		System.out.println(emptyOption.orElseGet(()->"optional null orElseGet"));
		
		System.out.println(strOption.orElseGet(()->"Optional value orElseGet"));
		
	}

}
