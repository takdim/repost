import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
public class Race {
	public boolean isStart = false;
	public int time;
	public int participant;
	// public List<String> ranking = Collections.synchronizedList(new ArrayList<>());
	public CopyOnWriteArrayList<String> ranking = new CopyOnWriteArrayList<>();

	public void start() {
		if (participant >= 3) {
			System.out.println("The race starts...");
			time = participant*1000;
			isStart = true;
		} else {
			System.out.println("The race cannot be started, runners are not enough");
		}
	}

	public void result() {
		while (true) {
			if (ranking.size() == participant) {
				System.out.println();
				System.out.println("The race is over");
				int count = 0;
				String[] rank = {"1st : ", "2nd : ", "3rd : "};
				for (String ranking : ranking) {
					if (count < 3) {
						System.out.printf("%s %s \n", rank[count], ranking);
					} else {
						System.out.printf("%s Lost \n", ranking);
					}
					if (count == 2) {
						System.out.println();
					}
					count++;
				}
				return;
			}
		}
		
	}
}