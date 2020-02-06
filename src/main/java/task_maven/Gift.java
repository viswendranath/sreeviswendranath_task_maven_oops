package task_maven;

import java.util.*;

public class Gift {
	List<Candy> candies;

	Gift() {
		candies = new ArrayList<Candy>();
	}

	public void addCandy(Candy candy) throws NullPointerException {
		if (candy != null)
			candies.add(candy);
		else
			throw new NullPointerException();
	}

	public int getNumberOfCandies() throws NullPointerException {
		if (candies != null)
			return candies.size();
		else
			throw new NullPointerException();
	}

	public List<Candy> getAllCandies() throws NullPointerException {
		if (candies != null)
			return candies;
		else
			throw new NullPointerException();
	}
}
