package forEach;

import java.util.ArrayList;
import java.util.List;

public class ForEach_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> gameList=new ArrayList<String>();
		
		gameList.add("Football");
		gameList.add("Cricket");
		gameList.add("Chess");
		gameList.add("Hocky");
		
		System.out.println("------Iterating by passing lambda expression----");
		gameList.forEach(games->System.out.println(games));
	}

}
