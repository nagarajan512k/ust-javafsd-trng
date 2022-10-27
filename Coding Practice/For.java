import java.util.*;

public class For {

	public static void main(String[] args) {
		

		List<String> gameList=new ArrayList<String>();
		
		gameList.add("Football");
		gameList.add("Cricket");
		gameList.add("Chess");
		gameList.add("Hocky");
		
		System.out.println("------Iterating by passing lambda expression----");
		gameList.forEach(games->System.out.println(games));
	}

}
