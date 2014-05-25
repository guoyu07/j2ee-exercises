package repositoryJstl;

import java.util.ArrayList;
import java.util.List;

public class FirstNamesArrayListRepository implements FirstNamesRepository {

	private List<String> firstNames;
	
	public FirstNamesArrayListRepository() {
		firstNames = new ArrayList<>();
		firstNames.add("Mickey");
		firstNames.add("Donald");
		firstNames.add("Minnie");
	}
	
	@Override
	public List<String> getFirstNames() {
		return firstNames;
	}

}
